package com.customertimes.Lesson10.task1.model;

import com.customertimes.Lesson4.ArchitecsSolutions;
import com.customertimes.Lesson4.DesignSolutions;
import com.customertimes.Lesson7.task1.IGetCourses;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class JSONex {
    public static void main(String[] args) {

        parseObjectToJSONWithConstructorAndList();
        parseJSONToObject();
    }

    private static void parseObjectToJSONWithConstructorAndList() {
        String filePath = "src/main/resources/jsonFile.json";

        ConstructionProjectsDepModel coModel = new ConstructionProjectsDepModel();
        coModel.setSolutionDoc("HelloDoc");
        WorkersModel workersModelOne = new WorkersModel();
        workersModelOne.setGroup('A');
        WorkersModel workersModelTwo = new WorkersModel();
        workersModelTwo.setGroup('B');
        WorkersModel workersModelThree = new WorkersModel();
        workersModelThree.setGroup('C');
        ForemansModel foremanOne = new ForemansModel();

        foremanOne.setClosedObj(true);
        ForemansModel foremanTwo = new ForemansModel();
        foremanTwo.setClosedObj(false);


        ObjectsDepModel workersModel = new ObjectsDepModel();
//        workersModel.setWorkers(List.of(workersModelOne, workersModelTwo, workersModelThree));
//        workersModel.setForemans(List.of(foremanOne, foremanTwo));
        workersModel.setTechPlanDoc("Tech plan 5");

        DesignersModel designerOne = new DesignersModel();
        designerOne.setSolutions(DesignSolutions.HIGHPRICE);
        DesignersModel designerTwo = new DesignersModel();
        designerTwo.setSolutions(DesignSolutions.LOWPRICE);

        ArchitectsModel architectOne = new ArchitectsModel();
        architectOne.setSolutions(ArchitecsSolutions.WOOD);

        ArchitectsModel architectTwo = new ArchitectsModel();
        architectTwo.setSolutions(ArchitecsSolutions.STONE);

        ConstructionProjectsDepModel consModel = new ConstructionProjectsDepModel();
//        consModel.setArchitects(List.of(architectOne, architectTwo));
//        consModel.setDesigners(List.of(designerOne, designerTwo));
        consModel.setSolutionDoc("Arch sol 5");

        ProjectDepModel poModel = new ProjectDepModel();
        poModel.setWorkplace("MSK");
//        poModel.setObjectsDep(List.of(workersModel));
//        poModel.setConstructionProjectsDep(List.of(consModel));

        AdministrativeModel adminStampModel = new AdministrativeModel();
        adminStampModel.setStamp("ADMINISTRATIVE STAMP");

        ReportsDepModel reportsDepModel = new ReportsDepModel();
        reportsDepModel.setProfit(100500);

        TransportServiceModel transportModel = new TransportServiceModel();
        transportModel.setExpenses(50000);

        FinancialDepModel financialDepMod = new FinancialDepModel();
        financialDepMod.setFinancialPlan("Reports: 6,9");
        financialDepMod.setReportsDep(reportsDepModel);
        financialDepMod.setTransportService(transportModel);


        BoardOfDirectorsModel model = new BoardOfDirectorsModel(34, "Alexander", LocalDateTime.now(), 14400, 44, adminStampModel, poModel, financialDepMod);
        Jackson.parseObjectToJSON(model, filePath);
    }

    private static void parseJSONToObject() {
        String filePath = "src/main/resources/jsonFileTwo.json";
        BoardOfDirectorsModel mod = new BoardOfDirectorsModel("Alexandr", LocalDateTime.now());
        BoardOfDirectorsModel model = Jackson.parseJSONToObject(filePath);
        System.out.println(mod.dateOfBirthday);
        mod.setDateOfBirthday(LocalDateTime.now().minusYears(10));
        System.out.println(mod.dateOfBirthday);

        System.out.println("DOB = " + model.getDateOfBirthday().toString());
        System.out.println("Salary = " + model.getSalary());
        System.out.println("Name = " + model.getName());
        System.out.println("Id = " + model.getId());
        System.out.println("Financial Dep--> financial plan = " + model.getFinancialDep().getFinancialPlan());
        System.out.println("Financial Dep--> Transport service --> expenses = " + model.getFinancialDep().getTransportService().getExpenses());
        System.out.println("Financial Dep--> Reports Dep --> profit = " + model.getFinancialDep().getReportsDep().getProfit());
        System.out.println("Project Dep--> workplace = "+ model.getProjectDep().getWorkplace());
        System.out.println("Project Dep--> Objects Dep--> techPlanDoc = "+ model.getProjectDep().getObjectsDep().get(0).getTechPlanDoc());
        System.out.println("Project Dep--> Objects Dep--> Workers--> group for first worker  = "+ model.getProjectDep().getObjectsDep().get(0).getWorkers().get(0).getGroup());
        System.out.println("Project Dep--> Objects Dep--> Workers--> group for second worker  = "+ model.getProjectDep().getObjectsDep().get(0).getWorkers().get(1).getGroup());
        System.out.println("Project Dep--> Objects Dep--> Foremans--> object was closed?  = "+ model.getProjectDep().getObjectsDep().get(0).getForemans().get(0).isClosedObj());
        System.out.println("Project Dep--> Objects Dep--> Foremans--> object was closed?  = "+ model.getProjectDep().getObjectsDep().get(0).getForemans().get(1).isClosedObj());
        System.out.println("Project Dep--> Construction Project Dep--> solution doc  = "+ model.getProjectDep().getConstructionProjectsDep().get(0).getSolutionDoc());
        System.out.println("Project Dep--> Construction Project Dep--> price for des. model 1  = "+ model.getProjectDep().getConstructionProjectsDep().get(0).getDesigners().get(0).getSolutions());
        System.out.println("Project Dep--> Construction Project Dep--> price for des. model 2  = "+ model.getProjectDep().getConstructionProjectsDep().get(0).getDesigners().get(1).getSolutions());
        System.out.println("Project Dep--> Construction Project Dep--> materials for architect solution 1  = "+ model.getProjectDep().getConstructionProjectsDep().get(0).getArchitects().get(0).getSolutions());
        System.out.println("Project Dep--> Construction Project Dep--> materials for architect solution 2 = "+ model.getProjectDep().getConstructionProjectsDep().get(0).getArchitects().get(1).getSolutions());
        System.out.println("Administrative--> STAMP = " + model.getAdministrative().getStamp());
    }

}