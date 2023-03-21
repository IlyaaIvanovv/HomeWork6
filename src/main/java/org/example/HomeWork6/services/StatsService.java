package org.example.HomeWork6.services;

import java.util.Arrays;

public class StatsService {

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSum(long[] sales) {
        long totalSale = sumSales(sales);

        return totalSale / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int quantityMonthMinSales(long[] sales) {
        int quantityMonth = 0;
        long averageSales = averageSum(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales [i] < averageSales) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }

    public int quantityMonthMaxSales(long[] sales) {
        int quantityMonth = 0;
        long averageSales = averageSum(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }
}
