package com.customertimes.Lesson11;

import com.customertimes.Lesson10.task1.model.BoardOfDirectorsModel;
import org.apache.log4j.Logger;

import java.time.LocalDateTime;

public class Runner {
    private static final Logger LOGGER = Logger.getLogger(Runner.class);

    public static void main(String[] args){
//        System.out.println("Hello WRLD!");
        getAndSet();
//        LOGGER.info("Output via Logger INFO");
//        LOGGER.debug("DEBUG");
    }

    public static void getAndSet(){
        BoardOfDirectorsModel boardOfdir = new BoardOfDirectorsModel();
        boardOfdir.setDateOfBirthday(LocalDateTime.now());
        boardOfdir.setSalary(1200);
        boardOfdir.setPriceInHour(12);
        boardOfdir.setName("Alex");

        LOGGER.info("DOB = "+ boardOfdir.getDateOfBirthday());
        LOGGER.info("Salary = "+ boardOfdir.getSalary());
        LOGGER.info("Price in hour = "+ boardOfdir.getPriceInHour());
        LOGGER.info("Name = "+ boardOfdir.getName());
    }
}
