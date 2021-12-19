package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkersModel {
    @JsonProperty("group")
    public char group;

    public WorkersModel(char group){
        this.group = group;
    }

    public WorkersModel(){
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }
}
