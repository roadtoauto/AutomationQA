package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForemansModel {
    @JsonProperty("closedObj")
    public boolean closedObj;

    public ForemansModel(boolean closedObj){
        this.closedObj = closedObj;
    }

    public ForemansModel(){
    }

    public boolean isClosedObj() {
        return closedObj;
    }

//    public void setClosedObj(boolean b) {
//        this.closedObj = closedObj;
//    }

    public void setClosedObj(boolean closedObj) {
        this.closedObj = closedObj;
    }
}
