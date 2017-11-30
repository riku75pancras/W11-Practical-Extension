//pre-defined Java class to calculate the current date
import java.time.LocalDate;
//pre-defined Java class to create an arraylist
import java.util.*;

public class SoftwareCompany_Ext {

    EasyIn2 reader = new EasyIn2();

    //creating arraylists which hold the attribute values for the employees and the applications
    private ArrayList<Employee_Ext> employeeArray = new ArrayList<Employee_Ext>();
    private ArrayList<Application_Ext> apps = new ArrayList<Application_Ext>();
    private ArrayList<Manager> managerArrayList = new ArrayList<Manager>();
    private ArrayList<Office> officeArrayList = new ArrayList<Office>();

    //private attributes which is used for the method printEverything()
    private double totalSalaryCost;
    private String actionApps = "\n";
    private String violenceApps = "\n";
    private String racingApps = "\n";
    private int longestNumberOfYearsWorked;
    private String longestWorkingEmployeeName;

    //minimal constructor as the arraylists stores the information for the employees and the applications
    public SoftwareCompany_Ext() {

    }

    //the method which asks the user to choose the function he wants to use and executes the program accordingly
    public void printEverything(){
        //boolean used to keep the program going unless the user chooses the 8th option
        boolean quitOption = false;

        while(quitOption != true){

            //prints out the different functions the program offers
            System.out.println("Please choose the following functions");
            System.out.println("1. Print out the list of all applications sold by the company and their prices");
            System.out.println("2. Print out the total salary cost of the company");
            System.out.println("3. Print names and salaries of all employees due to retire within next years");
            System.out.println("4. Calculate the price of the educational application after discount");
            System.out.println("5. List all entertainment apps in a given genre");
            System.out.println("6. Print names and retirement dates of all software developers who work on a given application"
                                + " and their managers");
            System.out.println("7. Find the employee with the longest experience in customer service");
            System.out.println("8. Quit the program");

            int functionChoice = reader.getInt();

            switch (functionChoice){

                case 1: {
                    printApplicationList();
                    break;
                }

                case 2: {

                    printTotalSalaryCost();
                    break;
                }

                case 3: {
                    printRetirementDetails();
                    break;
                }

                case 4: {
                    printFinalPriceEducational();
                    break;
                }

                case 5: {
                    printAppsInGenre();
                    break;
                }

                case 6: {
                    //if there is no application to offer from the company, it prints out the following
                    if (apps.size() == 0){
                        System.out.println("There is no application to sell");
                    }
                    else {

                        //in this case I only assigned the software developers to work on 2 programs
                        //this can be extended if needed
                        System.out.println("Which software would you like to check?");
                        System.out.println("1. Warfayre");
                        System.out.println("2. Memoriser");
                        int appOption = reader.getInt();

                        if (appOption == 1) {
                            System.out.println("Warfayre is worked on by ");
                            printGivenApplicationSoftwareDevelopers(apps.get(3));
                        }

                        if (appOption == 2) {
                            System.out.println("Memoriser is worked on by ");
                            printGivenApplicationSoftwareDevelopers(apps.get(1));
                        }
                        System.out.println();
                    }
                    break;
                }

                case 7:{
                    printLongestExperienceCustomerService();
                    break;
                }

                case 8:{
                    quitOption = true;
                    break;
                }

                default:{
                    //rejects any option that does not exist
                    System.out.println("Wrong option. Try again");
                }
            }
        }
    }

    //methods that assigns the attribute values input when the objects were created, onto the arraylist
    public void addEducationalApp(Application_Ext educationalApp){
        apps.add(educationalApp);
    }

    public void addEntertainmentApp(Application_Ext entertainmentApp){
        apps.add(entertainmentApp);
    }

    public void addFinanceApp(Application_Ext financeApp){
        apps.add(financeApp);
    }

    public void addCSEmployee(Employee_Ext customerService){
        employeeArray.add(customerService);
    }

    public void addSDEmployee(Employee_Ext softwareDeveloper){
        employeeArray.add(softwareDeveloper);
    }

    public void addManager(Manager manager){
        managerArrayList.add(manager);
    }

    public void addOffice(Office office){
        officeArrayList.add(office);
    }


    //method called for the 1st function, which prints out the list of application offered by the software company
    public void printApplicationList(){
        if (apps.size() == 0){
            System.out.println("There is no application to sell");
        }
        for (Application_Ext app : apps) {
            app.printApplication();
        }
    }

    //method that adds up the total salary cost by reviewing the array and adding the the salary to the total salary cost
    public void printTotalSalaryCost(){

        for (Employee_Ext emp : employeeArray){
            totalSalaryCost = totalSalaryCost + emp.getSalary();
        }

        System.out.println("The total salary cost is £" + totalSalaryCost);
    }

    //method that calls the printRetiringEmployees() from the application method which checks whether the employee
    //will retire within a year
    public void printRetirementDetails(){
        if (employeeArray.size() == 0){
            System.out.println("There is no employee in this company");
        }
        for(Employee_Ext emp : employeeArray){
            emp.printRetiringEmployees();
        }
    }

    //method that reduces the price of the educational application by applying the discount
    //which the discount rate is in percentage
    public void printFinalPriceEducational(){
        if (apps.size() == 0){
            System.out.println("There is no application to sell");
        }
        for(Application_Ext app: apps){
            if (app instanceof Educational_Ext){
                int academicDiscountRate = ((Educational_Ext) app).getAcademicDiscountRate();
                System.out.print("The price of " + app.getApplicationName() + " is £");
                app.printAcademicDiscountPrice(academicDiscountRate);
                System.out.println();

            }
        }
    }

    //method that contains a conditional statement which separates the applications into their genres
    //and prints the application names according to their genres
    public void printAppsInGenre(){

        if (apps.size() == 0) {
            System.out.println("There is no application to sell");
        }

        else {
            for (Application_Ext app : apps) {
                if (app instanceof Entertainment_Ext) {
                    if (((Entertainment_Ext) app).getGenre() == "Action") {
                        actionApps = actionApps + app.getApplicationName() + "\n";
                    }
                    if (((Entertainment_Ext) app).getGenre() == "Violence") {
                        violenceApps = violenceApps + app.getApplicationName() + "\n";
                    }

                    if (((Entertainment_Ext) app).getGenre() == "Racing") {
                        racingApps = racingApps + app.getApplicationName() + "\n";
                    }
                }
            }
            System.out.println("The apps with genre Action are " + actionApps);
            System.out.println("The apps with genre Violence are " + violenceApps);
            System.out.println("The apps with genre Racing are " + racingApps);
        }
    }

    //method that has the application as a parameter and if the employee is working on the specified app
    //then the name and the retirement date is printed out
    public void printGivenApplicationSoftwareDevelopers(Application_Ext app) {
        for (Employee_Ext emp: employeeArray) {
            if (emp instanceof SoftwareDeveloper_Ext) {
                if (((SoftwareDeveloper_Ext) emp).getApplicationWorkedOn() == app) {
                    System.out.println(emp.getName());
                    System.out.println("who retires on " + emp.getRetirementDate());
                    for (Office office: officeArrayList){
                        if (((SoftwareDeveloper_Ext) emp).getWorkingOffice() == office){
                            System.out.print("The name of the manager is ");
                            System.out.println(office.getManager().getName());
                        }
                    }
                }
            }
        }
    }

    //method that updates the longestNumberOfYearsWorked if that employee has worked the longest and simulataneously
    //sets the name in the attribute longestWorkingEmployeeName
    //once the all employees in the arraylist has been reviewed, it prints the name out
    public void printLongestExperienceCustomerService() {
        if (employeeArray.size() == 0){
            System.out.println("There is no employee in this company");
        }
        else {
            for (Employee_Ext emp : employeeArray) {
                if (emp instanceof CustomerService_Ext) {
                    int numberOfYearsWorked = ((CustomerService_Ext) emp).getNumberOfYearsWorked();
                    if (numberOfYearsWorked > longestNumberOfYearsWorked) {
                        longestNumberOfYearsWorked = numberOfYearsWorked;
                        longestWorkingEmployeeName = emp.getName();
                    }
                }

            }

            if (longestWorkingEmployeeName == null){
                System.out.println("There is no customer service employee in this company");
                System.out.println();
            }

            else {
                System.out.println("The customer service employee with longest experience is " + longestWorkingEmployeeName);
                System.out.println();
            }
        }
    }



}