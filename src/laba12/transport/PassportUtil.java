package laba12.transport;


class PassportUtil {

    private PassportUtil() {
    }
    public static Passport changeOwner(Passport passportTransport, laba12.citizen.Passport newOwner){
        System.out.println("\nOwner " + passportTransport.owner);
        System.out.println("\nnewOwner " + newOwner);
        passportTransport.owner=new laba12.citizen.Passport(newOwner);
        System.out.println("Owner is changed");
        return passportTransport;
    }
}
