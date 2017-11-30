public class Manager extends Employee_Ext{
    //private attributes which are specific to the manager
    private String dateRoleAssigned;
    private int numberOfEmployeesManaging;

    public Manager(int id, String name, double salary, String retirementDate,
                   String dateRoleAssigned, int numberOfEmployeesManaging){
        super(id, name, salary, retirementDate);
        this.dateRoleAssigned = dateRoleAssigned;
        this.numberOfEmployeesManaging = numberOfEmployeesManaging;
    }


}
