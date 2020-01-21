package laba12.citizen;

public class Passport {

    protected String passportNumber;
    protected String spouseId;
    private String name;
    private String surname;

    public Passport(String passportNumber, String name, String surname) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.surname = surname;
    }

    public Passport(Passport passport) {
        this.passportNumber = passport.passportNumber;
        this.name = passport.name;
        this.surname = passport.surname;
    }

    @Override
    public String toString() {
        return "\nPassport" +
                "\npassportNumber='" + passportNumber +
                "\nspouseId='" + spouseId +
                "\nname='" + name + '\'' +
                "\nsurname='" + surname;
    }
}
