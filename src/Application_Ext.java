public class Application_Ext {
    //private attributes which are the attributes which are shared across Entertainment, Finance
    //and Educational classes
    private String productCode;
    private String applicationName;
    private int latestVersionNumber;
    private double price;

    //multiple constructors which assigns the passed parameter values into the attributes
    public Application_Ext(String productCode, String applicationName,
                       int latestVersionNumber, double price){
        this.productCode = productCode;
        this.applicationName = applicationName;
        this.latestVersionNumber = latestVersionNumber;
        this.price = price;
    }

    public Application_Ext(){
        this.productCode = null;
        this.applicationName = null;
        this.latestVersionNumber = 0;
        this.price = 0;
    }

    //getter which returns the application name
    public String getApplicationName() {
        return applicationName;
    }

    //method that prints the product details
    public void printApplication(){
        System.out.println("The product code is " + productCode);
        System.out.println("The product name is " + applicationName);
        System.out.println("The price of the application is £" + price);
    }

    //method that prints the deduced price after the academic discount has been applied
    public void printAcademicDiscountPrice(int academicDiscountRate){
        double discountPrice = price * (100 - academicDiscountRate) / 100;
        System.out.println(discountPrice);
    }
}
