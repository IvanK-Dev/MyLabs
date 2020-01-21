package laba12.technics;

import java.util.Date;

public  class PassportUtil {

    private PassportUtil() {
    }

    public static void warrantyReplace(Passport passport) {
        passport.warrantyStartDate = new Date();
        System.out.println("WarrantyStartDate replaced");
    }
}
