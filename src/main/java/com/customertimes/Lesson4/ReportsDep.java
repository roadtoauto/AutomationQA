package com.customertimes.Lesson4;

import com.customertimes.Lesson7.task1.IGetOrder;

import java.time.LocalDateTime;

public class ReportsDep extends FinancialDep implements IGetOrder {
    private int profit;

    public ReportsDep(long id, String name, int salary, int priceInHour, LocalDateTime dateOfBirthday, String financialPlan, int profit) {
        super(id, name, salary, priceInHour, financialPlan, dateOfBirthday);
        this.profit = profit;

    }

    public ReportsDep(long id, String name, int salary, int priceInHour, LocalDateTime dateOfBirthday, int profit) {
        super(id, name, salary, priceInHour, dateOfBirthday);
        this.profit = profit;

    }

    public static String makeReport() {
        String message = "Reports department: We sent reports";
        return message;
    }

    @Override
    public void work() {
        System.out.println("We work with reports!");
    }


    @Override
    public String toString() {
        String result = "id = " + id + ", name = " + name + ", salary = " + getSalary() + ", price in hour = " + getPriceInHour() + ", financial plan =" + financialPlan + ", profit =" + profit;
        return result;
    }


    @Override
    public void sendInfo() {
        System.out.println("Reports department: Soon report will be prepared");
    }
}
