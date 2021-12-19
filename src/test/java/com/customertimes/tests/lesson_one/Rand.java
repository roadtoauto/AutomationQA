package com.customertimes.tests.lesson_one;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class Rand {
    private  int a = 12;

    private  int randomNum(){
        int min = 1;
        int max = 20;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        return i;
    }

    private boolean range(){
        if(randomNum() < 10){
            return true;
        }else{
            return false;
        }
    }

    @Test(description = "random num")
    private void numTest(){
        Assert.assertEquals(a, randomNum(), "Num not Equals");
    }

    @Test(description = "range")
    private void rangeTest(){
        Assert.assertEquals(range(), true, "Num is not in range");
    }
}
