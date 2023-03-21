package org.example.HomeWork6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void SumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);

    }

    @Test
    public void AverageSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSumSales = 15;
        long actualAverageSumSales = service.averageSum(sales);

        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);

    }

    @Test
    public void MaxMonthlySales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test
    public void MinMonthlySales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        long actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);

    }

    @Test
    public void QuantityMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMinMonth = 5;
        long actualQuantityMinMonth = service.quantityMonthMinSales(sales);

        Assertions.assertEquals(expectedQuantityMinMonth, actualQuantityMinMonth);

    }

    @Test
    public void QuantityMonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedQuantityMaxMonth = 5;
        long actualQuantityMaxMonth = service.quantityMonthMaxSales(sales);

        Assertions.assertEquals(expectedQuantityMaxMonth, actualQuantityMaxMonth);

    }

}
