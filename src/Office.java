public class Office {
    private String postcode;
    private String officeName;
    private Manager manager;

    public Office(String postcode, String officeName, Manager manager){
        this.postcode = postcode;
        this.officeName = officeName;
        this.manager = manager;
    }

    public String getOfficeName() {
        return officeName;
    }

    public Manager getManager() {
        return manager;
    }
}
