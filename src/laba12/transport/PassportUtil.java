package laba12.transport;


public class PassportUtil {

    private PassportUtil() {
    }
    public static Passport changeOwner(Passport passportTransport, laba12.citizen.Passport newOwner){
        Passport newPassport=new Passport(passportTransport);
        newPassport.owner=new laba12.citizen.Passport(newOwner);
        System.out.println("\nnewOwner\n " + newOwner);
        System.out.println("\nOwner\n " + newPassport.owner);
        System.out.println("Owner is changed");
        return newPassport;
    }

}
