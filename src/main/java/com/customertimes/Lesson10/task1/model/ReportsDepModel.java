package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReportsDepModel {
    @JsonProperty("profit")
    private int profit;



    public ReportsDepModel(int profit, ConstructionProjectsDepModel constructionProjectsDep, ObjectsDepModel objectsDep) {
        this.profit = profit;

    }

    public ReportsDepModel() {

    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

}
