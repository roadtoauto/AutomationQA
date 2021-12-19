package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinancialDepModel {
    @JsonProperty("financialPlan")
    public String financialPlan;
    @JsonProperty("transportService")
    private TransportServiceModel transportService;
    @JsonProperty("reportsDep")
    private ReportsDepModel reportsDep;

    public FinancialDepModel(String financialPlan, TransportServiceModel transportService, ReportsDepModel reportsDep){
        this.financialPlan = financialPlan;
        this.transportService=transportService;
        this.reportsDep=reportsDep;
    }

    public FinancialDepModel(){

    }

    public String getFinancialPlan() {
        return financialPlan;
    }

    public void setFinancialPlan(String financialPlan) {
        this.financialPlan = financialPlan;
    }

    public TransportServiceModel getTransportService() {
        return transportService;
    }

    public void setTransportService(TransportServiceModel transportService) {
        this.transportService = transportService;
    }

    public ReportsDepModel getReportsDep() {
        return reportsDep;
    }

    public void setReportsDep(ReportsDepModel reportsDep) {
        this.reportsDep = reportsDep;
    }
}
