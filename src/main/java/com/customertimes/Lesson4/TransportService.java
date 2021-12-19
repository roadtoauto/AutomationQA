package com.customertimes.Lesson4;

import com.customertimes.Lesson7.task1.IGetOrder;

import java.time.LocalDateTime;

public class TransportService extends FinancialDep implements IGetOrder {

    protected int expenses;

    TransportService(long id, String name, int salary, int priceInHour, LocalDateTime dateOfBirthday, String financialPlan, int expenses) {
        super(id, name, salary, priceInHour, financialPlan, dateOfBirthday);
        this.expenses = expenses;
    }

    TransportService(long id, String name, int salary, int priceInHour, LocalDateTime dateOfBirthday, int expenses) {
        super(id, name, salary, priceInHour, dateOfBirthday);
        this.expenses = expenses;
    }

    public static String getProblems() {
        String message = "Transport service: We have problems with the materials";
        return message;
    }

    @Override
    public void work() {
        System.out.println("We work with delivery");
    }

    @Override
    public String toString() {
        String result = "id = " + id + ", name = " + name + ", salary = " + getSalary() + ", price in hour = " + getPriceInHour() + ", financial plan =" + financialPlan + ", expenses =" + expenses;
        return result;
    }

    @Override
    public void sendInfo() {
        System.out.println("Documents sent");
    }

    @Override
    public void getOrder(){
        System.out.println("Transport service intarface: Additional order");
    }
}
