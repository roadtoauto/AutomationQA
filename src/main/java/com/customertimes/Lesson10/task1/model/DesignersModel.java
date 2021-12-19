package com.customertimes.Lesson10.task1.model;

import com.customertimes.Lesson4.DesignSolutions;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DesignersModel {
    @JsonProperty("Solutions")
    public  DesignSolutions solutions;

    public DesignersModel(DesignSolutions solutions){
        this.solutions=solutions;
    }

    public DesignersModel(){
    }

    public DesignSolutions getSolutions() {
        return solutions;
    }

    public void setSolutions(DesignSolutions solutions) {
        this.solutions = solutions;
    }
}
