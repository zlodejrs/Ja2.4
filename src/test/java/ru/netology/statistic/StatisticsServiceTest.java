package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
        StatisticsService service = new StatisticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIndex() {
        StatisticsService service = new StatisticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMaxIndex(purchases);
    }

    @Test
    void findMinIndex() {
        StatisticsService service = new StatisticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMinIndex(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void belowAverage() {
        StatisticsService service = new StatisticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void aboveAverage() {
        StatisticsService service = new StatisticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverage(purchases);
        assertEquals(expected, actual);
    }
}