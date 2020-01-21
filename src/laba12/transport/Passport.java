package laba12.transport;

public class Passport {
    private String producer;
    private String kind;
    private int power;
    protected laba12.citizen.Passport owner;

    public Passport(String producer, String kind, int power) {
        this.producer = producer;
        this.kind = kind;
        this.power = power;
    }

    public Passport(Passport passport) {
        this.producer = passport.producer;
        this.kind = passport.kind;
        this.power = passport.power;
    }

    public  void changeOwner(laba12.citizen.Passport newOwner) {
        PassportUtil.changeOwner(this,newOwner);
    }

    @Override
    public String toString() {
        return "\nPassport" +
                "\nproducer - " + producer +
                "\nkind - " + kind +
                "\npower - " + power +
                "\nowner - " + owner+"\n";
    }
}
