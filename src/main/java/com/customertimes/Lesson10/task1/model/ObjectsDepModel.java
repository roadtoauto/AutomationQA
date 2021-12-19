package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ObjectsDepModel {
    @JsonProperty("techPlanDoc")
    public String techPlanDoc;
    @JsonProperty("foremans")
    private List<ForemansModel> foremans;
    @JsonProperty("workers")
    private List<WorkersModel> workers;

    public ObjectsDepModel(String techPlanDoc, List<ForemansModel> foremans, List<WorkersModel> workers) {
        this.techPlanDoc = techPlanDoc;
        this.foremans = foremans;
        this.workers = workers;
    }
    public ObjectsDepModel(String techPlanDoc) {
        this.techPlanDoc = techPlanDoc;
    }

    public ObjectsDepModel() {
    }

    public String getTechPlanDoc() {
        return techPlanDoc;
    }

    public void setTechPlanDoc(String techPlanDoc) {
        this.techPlanDoc = techPlanDoc;
    }

    public List<ForemansModel> getForemans() {
        return foremans;
    }

    public void setForemans(List<ForemansModel> foremans) {
        this.foremans = foremans;
    }

    public List<WorkersModel> getWorkers() {
        return workers;
    }

    public void setWorkers(List<WorkersModel> workers) {
        this.workers = workers;
    }


}
