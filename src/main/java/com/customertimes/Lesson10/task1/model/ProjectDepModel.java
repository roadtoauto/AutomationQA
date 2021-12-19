package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProjectDepModel {
    @JsonProperty("workplace")
    public String workplace;
    @JsonProperty("constructionProjectsDep")
    private List<ConstructionProjectsDepModel> constructionProjectsDep;
    @JsonProperty("objectsDep")
    private List<ObjectsDepModel> objectsDep;

    public ProjectDepModel(String workplace, List<ConstructionProjectsDepModel> constructionProjectsDep, List<ObjectsDepModel> objectsDep) {
        this.workplace = workplace;
        this.constructionProjectsDep = constructionProjectsDep;
        this.objectsDep = objectsDep;
    }

    public ProjectDepModel() {

    }


    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public List<ConstructionProjectsDepModel> getConstructionProjectsDep() {
        return constructionProjectsDep;
    }

    public void setConstructionProjectsDep(List<ConstructionProjectsDepModel> constructionProjectsDep) {
        this.constructionProjectsDep = constructionProjectsDep;
    }

    public List<ObjectsDepModel> getObjectsDep() {
        return objectsDep;
    }

    public void setObjectsDep(List<ObjectsDepModel> objectsDep) {
        this.objectsDep = objectsDep;
    }



}
