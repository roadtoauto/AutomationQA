package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransportServiceModel {
    @JsonProperty("expenses")
    protected int expenses;

    public TransportServiceModel(int expenses){
        this.expenses = expenses;
    }

    public TransportServiceModel(){
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }
}
