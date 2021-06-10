package ru.netology.statistic;

public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findAverage(long[] purchases) {
        long average = 0;
        for (long purchase : purchases) {
            average = purchase;
        }
        return average;
    }


    public long findMaxIndex(long[] purchases) {
        int maxIndex = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= purchases[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }

    public long findMinIndex(long[] purchases) {
        int minIndex = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] <= purchases[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex + 1;
    }

    public long belowAverage(long[] purchases) {
        int index = 0;
        long average = calculateSum(purchases) / purchases.length;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < average)
                index++;
        }
        return index;
    }

    public long aboveAverage(long[] purchases) {
        int index = 0;
        long average = calculateSum(purchases) / purchases.length;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > average)
                index++;
        }
        return index;
    }
}