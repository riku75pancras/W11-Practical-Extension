public class Finance_Ext extends Application_Ext{
    //attribute specific to the financia; app which is the flag indicating whether it deals with personal or corporate
    //finance
    private boolean flagPersonalFinance;

    //constructor which contains super and assigns the flag
    public Finance_Ext(String productCode, String applicationName,
                   int latestVersionNumber, double price,
                   boolean flagFinanceOption){
        super(productCode, applicationName, latestVersionNumber, price);
        this.flagPersonalFinance = flagPersonalFinance;

    }

    //prints the details of the financial app along with the supplementary comment that
    //it is a financial app
    public void printApplication(){
        super.printApplication();
        System.out.println("This is a financial application");
        System.out.println();
    }
}
