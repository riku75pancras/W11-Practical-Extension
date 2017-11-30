public class Educational_Ext extends Application_Ext {
    //attributes specific to the Educational class
    private String educationLevel;
    private int academicDiscountRate;

    //constructor which contains super and assigns education level and academic dicount rate which are attributes
    //specific to the Educational class
    public Educational_Ext(String productCode, String applicationName,
                       int latestVersionNumber, double price,
                       String educationLevel, int academicDiscountRate){
        super(productCode, applicationName, latestVersionNumber, price);
        this.educationLevel = educationLevel;
        this.academicDiscountRate = academicDiscountRate;
    }

    //getter which returns the discount rate
    public int getAcademicDiscountRate() {
        return academicDiscountRate;
    }

    //prints the details of the educational app along with the supplementary comment that
    //it is an educational app
    public void printApplication(){
        super.printApplication();
        System.out.println("This is an educational application");
        System.out.println();
    }
}
