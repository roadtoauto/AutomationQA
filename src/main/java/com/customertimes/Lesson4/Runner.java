package com.customertimes.Lesson4;

import java.time.LocalDateTime;

public class Runner {
    public static void main(String[] args) {


        BoardOfDirectors architect1 = new Architects(12, "Alex", 10000, 50, "Test Street", LocalDateTime.now(), "Solution for Client7", ArchitecsSolutions.STONE);
        BoardOfDirectors architect2 = new Architects(13, "Ivan", 15000, 150, "Test Street 2", LocalDateTime.now(), "Solution for Client1", ArchitecsSolutions.WOOD);
        BoardOfDirectors ts1 = new TransportService(228, "Andrey", 12000, 120, LocalDateTime.now(), 2000);
        BoardOfDirectors ts2 = new TransportService(229, "Nikolay", 8500, 80, LocalDateTime.now(), "code007", 700);
        BoardOfDirectors des1 = new Designers(20, "Nika", 9600, 48, "Test Street", LocalDateTime.now(), "Design 9", DesignSolutions.MEDIUMPRICE);
        BoardOfDirectors wrk1 = new Workers(200, "Maksim", 9500, 45, "object 7", LocalDateTime.now(), "Number1", 'A');
        FinancialDep rep1 = new ReportsDep(33, "Alexey", 9500, 49, LocalDateTime.now(), 2000);
        ConstructionProjectsDep arch3 = new Architects(13, "Mihail", 9000, 30, "Test Street", LocalDateTime.now(), "Solution 5");
        ConstructionProjectsDep des2 = new Designers(25, "Alexandra", 9300, 40, "Test Street 2", LocalDateTime.now(), "Tech Doc");
        ObjectsDep foreman1 = new Foremans(139, "Eugeniy", 22000, 55, "Test Street", LocalDateTime.now(), "Num2", true);
        Workers wrk2 = new Workers(221, "Ruslan", 17500, 22, "object 8", LocalDateTime.now(), "solution 8");
        Architects arch4 = new Architects(112, "Alex", 2200, 47, "Msk", LocalDateTime.now(), "Solution 2", ArchitecsSolutions.WOOD);
        Foremans foreman2 = new Foremans(139, "Eugeniy", 11000, 55, "Test Street", LocalDateTime.now(), "Num2", true);
        ObjectsDep wrk3 = new Workers(222, "Ruslan", 12200, 22, "object 8", LocalDateTime.now(), "solution 8");
        ObjectsDep wrk4 = new Workers(226, "Ruslan", 7200, 22, "object 8", LocalDateTime.now(), "solution 8");
        TransportService ts3 = new TransportService(228, "Andrey", 12000, 120, LocalDateTime.now(), 2000);
        ReportsDep reporter = new ReportsDep(13, "Alexander", 10000, 22, LocalDateTime.now(),-150);

        ts3.getOrder();
        rep1.getOrder();
        rep1.getProblemWithReports();
        reporter.getProblemWithReports();
        arch4.tommorowPhotosession();
        foreman2.getCourses();
        System.out.println("Reporter losed reports and get minus for salary: salary now = " + reporter.getSalary()+ reporter.minusSlry(2000));
        foreman1.getHolidays();

        System.out.println("Salary for wrk3 =" + wrk3.getSalary());
        System.out.println("Salary after Tax for wrk3 ="+ wrk3.sallaryWithTax());
        System.out.println("Price in Hour for wrk3 = " + wrk3.countPriceInHour());
        System.out.println("Price in Hour for foreman1 = " + foreman1.countPriceInHour());
        System.out.println("Bonus for des2 + 500$ = " + des2.plusBonus());
        System.out.println("-250 salary for arch = " + arch3.minusSalary());
        foreman2.closedObject();
        System.out.println(foreman2.remarksForWork());
        System.out.println(arch4.forPersonSolution());
        System.out.println(arch4.getPriceInHour());
        System.out.println(architect1.getDateOfBirthday());
        System.out.println(wrk1.getTodayDate());
        System.out.println("getSalary for wrk2 = " + wrk2.getSalary());
        foreman1.departament();
        System.out.println(TransportService.getProblems());
        System.out.println(ReportsDep.makeReport());
        rep1.sendInfo();
        System.out.println("Designers:" + Designers.getSolution() + " For project 4.");
        arch3.information();
        des2.information();
        des2.departament();
        arch3.departament();
        Workers.getMaterials();
        wrk2.work();
        foreman1.valueOfwork();
        wrk2.valueOfwork();
        System.out.println(architect1);
        System.out.println(architect2);
        System.out.println(ts1);
        System.out.println(ts2);
        System.out.println(des1);
        System.out.println(wrk1);
    }
}
