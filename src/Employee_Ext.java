import java.time.LocalDate;

public class Employee_Ext {
    //private attributes which are the attributes which are shared across SoftwareDeveloper and CustomerService
    //classes
    private int id;
    private String name;
    private double salary;
    private String retirementDate;

    //using predefined java class which is used to check whether the employee retires within the next year
    LocalDate ld = LocalDate.now();
    int monthToday = ld.getMonthValue();
    int dateToday = ld.getDayOfMonth();

    //Want to extract the last two digits from the year (if 2017, extract 17)
    int yearTodayTwoDigits = ld.getYear() % 2000;

    //multiple constructors which assigns the passed parameter values into the attributes
    public Employee_Ext(int id, String name, double salary, String retirementDate){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.retirementDate = retirementDate;
    }

    public Employee_Ext(){
        this.id = 0;
        this.name = null;
        this.salary = 0;
        this.retirementDate = null;
    }

    //getters which return attribute values
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getRetirementDate() {
        return retirementDate;
    }

    //method which contains conditional statements which checks whether the employee is due to retire within a year
    //then prints the name and salary if the employee will retire
    public void printRetiringEmployees(){
        //extract the date, month and year using substring and converting them into int
        String retirementDateOfMonthString = retirementDate.substring(0, 2);
        String retirementMonthString = retirementDate.substring(2, 4);
        String retirementYearString = retirementDate.substring(4);

        int retirementDateOfMonth = Integer.parseInt(retirementDateOfMonthString);
        int retirementMonth = Integer.parseInt(retirementMonthString);
        int retirementYear = Integer.parseInt(retirementYearString);

        //using conditional statements to check whether the employee retires within a year today
        if (retirementYear - yearTodayTwoDigits <= 1) if (retirementYear - yearTodayTwoDigits == 0) {
            System.out.println("The name of the retiring employee is " + name);
            System.out.println("The salary of the retiring employee is " + salary);
            System.out.println();
        }

        else if (retirementMonth - monthToday < 0) {
            System.out.println("The name of the retiring employee is " + name);
            System.out.println("The salary of the retiring employee is " + salary);
            System.out.println();
        }

        else if (retirementDateOfMonth - dateToday <= 0) {
            System.out.println("The name of the retiring employee is " + name);
            System.out.println("The salary of the retiring employee is " + salary);
            System.out.println();
        }
    }
}
