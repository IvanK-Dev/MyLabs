package laba8;

public class PostOffice {
    public int postOfficeNumber=0;
    public String address="Адрес";
    private static final String CITY = "Zaporozhye";

    public PostOffice() {
    }

    public String infoPOffice(){
        return "Number : "+ this.postOfficeNumber
                +"\nAddress : "+this.address
                +"\nSity : "+ CITY;
    }
}
