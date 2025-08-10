package ru.edu.leetcode.utils;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.Arrays;
import java.util.function.Supplier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

/**
 * Базовый абстрактный класс для тестов, который автоматически добавляет функциональность: Замер
 * использования памяти (heap) Замер времени выполнения Статистику по времени выполнения
 * (мин/макс/среднее) Вывод результатов в удобном формате
 */
public abstract class PerformanceTrackingTest {
    private TestInfo currentTestInfo;

    @BeforeEach
    void setTestInfo(TestInfo testInfo) {
        this.currentTestInfo = testInfo;
    }

    protected <T> T runWithMetrics(Supplier<T> function) {
        System.out.println("\n--- Запущен тест: " + currentTestInfo.getDisplayName() + " ---");

        // Замер памяти
        long memoryUsed = measureMemory(function);
        System.out.printf(
                "Использовано памяти: %d байтов (%.2f мб)%n",
                memoryUsed, memoryUsed / (1024.0 * 1024.0));

        // Замер времени
        long[] times = measureTime(function::get, 10);
        printTimeStats(times);

        return function.get();
    }

    // TODO подумать как замерять память на малых величинах
    private static long measureMemory(Supplier<?> function) {
        MemoryPoolMXBean pool =
                ManagementFactory.getMemoryPoolMXBeans().stream()
                        .filter(b -> b.getName().contains("Eden"))
                        .findFirst()
                        .orElseThrow();

        long before = pool.getUsage().getUsed();
        System.gc();
        Object result = function.get();
        long after = pool.getUsage().getUsed();
        return Math.max(0, after - before);
    }

    private static long[] measureTime(Runnable function, int iterations) {

        for (int i = 0; i < 3; i++) {
            function.run();
        }

        long[] times = new long[iterations];
        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();
            function.run();
            times[i] = System.nanoTime() - start;
        }
        return times;
    }

    private static void printTimeStats(long[] nanoTimes) {
        long min = Arrays.stream(nanoTimes).min().orElse(0);
        long max = Arrays.stream(nanoTimes).max().orElse(0);
        double avg = Arrays.stream(nanoTimes).average().orElse(0);

        System.out.printf(
                "Статистика времени (мс): Min=%.3f | Max=%.3f | Avg=%.3f%n",
                min / 1_000_000.0, max / 1_000_000.0, avg / 1_000_000.0);

        double[] msTimes =
                Arrays.stream(nanoTimes).asDoubleStream().map(t -> t / 1_000_000.0).toArray();

        System.out.println("Результаты (мс): " + Arrays.toString(msTimes));
    }
}
