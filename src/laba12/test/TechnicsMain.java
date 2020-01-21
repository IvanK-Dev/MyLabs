package laba12.test;

import laba12.technics.Passport;
import laba12.technics.PassportUtil;

public class TechnicsMain {
    public static void main(String[] args) {
        Passport frig=new Passport("PRODUCER","FRIGE",10000);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frig);
        PassportUtil.warrantyReplace(frig);
        System.out.println(frig);

    }

}
