package org.example.HomeWork6.services;

import java.util.Arrays;

public class StatsService {

    public int sumSales(int[] sales) {

        return Arrays.stream(sales).sum();
    }

    public int averageSum(int[] sales) {

        return Arrays.stream(sales).sum() / 12;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int quantityMonthMinSales(int[] sales) {
        int averageSales = 15; // Среднее кол-во продаж из метода averageSum (2)
        int quantityMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales [i] < averageSales) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }

    public int quantityMonthMaxSales(int[] sales) {
        int averageSales = 15; // Среднее кол-во продаж из метода averageSum (2)
        int quantityMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                quantityMonth++;
            }
        }
        return quantityMonth;
    }
}
