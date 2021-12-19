package com.customertimes.Lesson4;

import com.customertimes.Lesson7.task1.IGetOrder;

import java.time.LocalDateTime;

public abstract class FinancialDep extends BoardOfDirectors implements IGetOrder {
    public String financialPlan;

    FinancialDep(long id, String name, int salary, int priceInHour, String financialPlan, LocalDateTime dateOfBirthday) {
        super(id, name, salary, priceInHour, dateOfBirthday);
        this.financialPlan = financialPlan;
    }

    FinancialDep(long id, String name, int salary, int priceInHour, LocalDateTime dateOfBirthday) {
        super(id, name, salary, priceInHour, dateOfBirthday);
    }

    public int plusBonus(int salary) {
        int bonus = salary + 500;
        return bonus;
    }

    public int minusSalary(int salary) {
        int minus = salary - 250;
        return minus;
    }

    public static int countPriceInHour(int salary) {
        int a = (22 * 8) / salary;
        return a;
    }

    public abstract void sendInfo();

    @Override
    public void getOrder(){
        System.out.println("Financial Dep interface: The order will be considered in the report");
    }

}
