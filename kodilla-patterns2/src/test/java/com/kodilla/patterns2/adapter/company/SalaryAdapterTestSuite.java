package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.company.SalaryAdapter;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {

        //given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //when
        double totalSalary = salaryAdapter.TotalCalculator(workers.getWorkers(), workers.getSalary());
        //then
        Assert.assertEquals(31200.00, totalSalary,0);

    }
}
