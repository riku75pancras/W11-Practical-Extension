public class Entertainment_Ext extends Application_Ext {
    //private attributes specific to the Entertainment applications
    private String genre;
    private double rating;

    //constructor which contains super and assigns genre and rating which are attributes
    //specific to the Entertainment class
    public Entertainment_Ext(String productCode, String applicationName,
                         int latestVersionNumber, double price,
                         String genre, double rating){
        super(productCode, applicationName, latestVersionNumber, price);
        this.genre = genre;
        this.rating = rating;
    }

    //getter which return the genre
    public String getGenre() {
        return genre;
    }

    //prints the details of the entertainment app along with the supplementary comment that
    //it is an entertainment app
    public void printApplication(){
        super.printApplication();
        System.out.println("This is an entertainment application");
        System.out.println();
    }
}
