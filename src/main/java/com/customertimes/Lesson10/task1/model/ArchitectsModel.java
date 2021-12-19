package com.customertimes.Lesson10.task1.model;

import com.customertimes.Lesson4.ArchitecsSolutions;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArchitectsModel {
    @JsonProperty("solutions")
    public  ArchitecsSolutions solutions;

    public ArchitectsModel(){
    }

    public ArchitecsSolutions getSolutions() {
        return solutions;
    }

    public void setSolutions(ArchitecsSolutions solutions) {
        this.solutions = solutions;
    }
}
