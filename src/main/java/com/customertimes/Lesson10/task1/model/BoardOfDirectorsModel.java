package com.customertimes.Lesson10.task1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardOfDirectorsModel {
    public final static int tax = 25;
    @JsonProperty("id")
    protected long id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("dateOfBirthday")
    @JsonSerialize(using = ToStringSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    public LocalDateTime dateOfBirthday;
    @JsonProperty("salary")
    private int salary;
    @JsonProperty("priceInHour")
    private int priceInHour;
    @JsonProperty("administrative")
    private AdministrativeModel administrative;
    @JsonProperty("ProjectDep")
    private ProjectDepModel projectDep;
    @JsonProperty("financialDep")
    private FinancialDepModel financialDep;




    public BoardOfDirectorsModel(long id, String name, LocalDateTime dateOfBirthday, int salary, int priceInHour, AdministrativeModel administrative, ProjectDepModel projectDep, FinancialDepModel financialDep) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.salary = salary;
        this.priceInHour = priceInHour;
        this.administrative = administrative;
        this.projectDep=projectDep;
        this.financialDep = financialDep;
    }

    public BoardOfDirectorsModel() {

    }

    public BoardOfDirectorsModel(String name, LocalDateTime dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
    }


//    public  long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public LocalDateTime getDateOfBirthday() {
//        return dateOfBirthday;
//    }
//
//    public void setDateOfBirthday(LocalDateTime dateOfBirthday) {
//        this.dateOfBirthday = dateOfBirthday;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getPriceInHour() {
//        return priceInHour;
//    }
//
//    public void setPriceInHour(int priceInHour) {
//        this.priceInHour = priceInHour;
//    }
//
//    public AdministrativeModel getAdministrative() {
//        return administrative;
//    }
//
//    public void setAdministrative(AdministrativeModel administrative) {
//        this.administrative = administrative;
//    }
//
//    public ProjectDepModel getProjectDep() {
//        return projectDep;
//    }
//
//    public void setProjectDep(ProjectDepModel projectDep) {
//        this.projectDep = projectDep;
//    }
//
//    public FinancialDepModel getFinancialDep() {
//        return financialDep;
//    }
//
//    public void setFinancialDep(FinancialDepModel financialDep) {
//        this.financialDep = financialDep;
//    }

}
