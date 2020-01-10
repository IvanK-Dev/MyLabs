package laba8;

public class Client {
    public String firstName = "Иван";
    public String secondName = "Иванов";
    private boolean vip = false;
    static int COUNTER=0;

    public void setVIP(boolean vip) {
        this.vip = vip;
    }

    public Client() {
        COUNTER++;
    }

    public Client(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        COUNTER++;
    }

    public void isVIP() {
        System.out.println("Client : " + this.firstName + " " + this.secondName
                + "is " + (this.vip ? "is VIP" : "isn't VIP"));
    }

    public void sendAboutPost() {
        System.out.println(" Send message to client :" +
                this.firstName + " " + this.secondName
        );
    }

    public void sendAboutPost(String str) {
        System.out.println(" Send message to client :\n" +
                this.firstName + " " + this.secondName
                +"\n Message :\n"
                +str
        );
    }
    public static void staticMethod(){
        System.out.println("staticMethod are Worked");
    }

    public static void numberOfClients(){
        System.out.println("Total clients : " + COUNTER);
    }
}
