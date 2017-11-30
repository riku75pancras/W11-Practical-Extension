public class SoftwareDeveloper_Ext extends Employee_Ext{
    //private attribute which is specific to the SoftwareDeveloper class
    private Application_Ext applicationWorkedOn;
    private int numberOfSpecialistSkills;
    private Office workingOffice;




    //constructor which contains super and assigns the number of specialist skills the software developer has
    public SoftwareDeveloper_Ext(int id, String name, double salary, String retirementDate, Application_Ext applicationWorkedOn,
                             int numberOfSpecialistSkills, Office workingOffice){
        super(id, name, salary, retirementDate);
        this.applicationWorkedOn = applicationWorkedOn;
        this.numberOfSpecialistSkills = numberOfSpecialistSkills;
        this.workingOffice = workingOffice;
    }

    public Office getWorkingOffice(){
        return workingOffice;
    }

    public Application_Ext getApplicationWorkedOn() {
        return applicationWorkedOn;
    }

}
