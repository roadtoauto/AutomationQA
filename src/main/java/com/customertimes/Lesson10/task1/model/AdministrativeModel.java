package com.customertimes.Lesson10.task1.model;

public class AdministrativeModel {
    protected String stamp;

    protected AdministrativeModel(String stamp){
        this.stamp = stamp;
    }

    protected AdministrativeModel(){
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
}
