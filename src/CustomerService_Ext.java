public class CustomerService_Ext extends Employee_Ext{
    //private attribute which is speciific to the customer service employee
    private Application_Ext applicationWorkedOn;
    private int numberOfYearsWorked;

    //constructor which contains super and assigns the number of years worked in customer service
    public CustomerService_Ext(int id, String name, double salary, String retirementDate, Application_Ext applicationWorkedOn,
                           int numberOfYearsWorked){
        super(id, name, salary, retirementDate);
        this.applicationWorkedOn = applicationWorkedOn;
        this.numberOfYearsWorked = numberOfYearsWorked;
    }

    public Application_Ext getApplicationWorkedOn() {
        return applicationWorkedOn;
    }

    //getter which returns the number of years worked in customer service
    public int getNumberOfYearsWorked() {
        return numberOfYearsWorked;
    }
}