package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ConstructionProjectsDepModel {
    @JsonProperty("solutionDoc")
    public String solutionDoc;
    @JsonProperty("designers")
    private List<DesignersModel> designers;
    @JsonProperty("architect")
    private List<ArchitectsModel> architects;



    public ConstructionProjectsDepModel(String solutionDoc, List<DesignersModel> designers, List<ArchitectsModel> architects){
        this.solutionDoc = solutionDoc;
        this.designers = designers;
        this.architects = architects;

    }

    public ConstructionProjectsDepModel(){
    }

    public String getSolutionDoc() {
        return solutionDoc;
    }

    public void setSolutionDoc(String solutionDoc) {
        this.solutionDoc = solutionDoc;
    }

    public List<ArchitectsModel> getArchitects() {
        return architects;
    }

    public void setArchitects(List<ArchitectsModel> architects) {
        this.architects = architects;
    }

    public List<DesignersModel> getDesigners() {
        return designers;
    }

    public void setDesigners(List<DesignersModel> designers) {
        this.designers = designers;
    }


}
