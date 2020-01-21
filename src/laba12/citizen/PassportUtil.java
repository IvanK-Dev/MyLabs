package laba12.citizen;

public class PassportUtil {
    private PassportUtil() {
        //«закрытый конструктор»
    }

    public static void marriageRegistrate(Passport husband, Passport wife) {
        husband.spouseId = wife.passportNumber;
        wife.spouseId = husband.passportNumber;
    }
}
