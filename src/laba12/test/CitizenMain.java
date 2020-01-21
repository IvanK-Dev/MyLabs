package laba12.test;

import laba12.citizen.Passport;
import laba12.citizen.PassportUtil;

public class CitizenMain {
    public static void main(String[] args) {
        Passport citizen1=new Passport("CB466666","Ivan","Ivanov");
        Passport citizen2=new Passport("CB499999","Irina","Petrova");
        System.out.println(citizen1+"\n"+citizen2);
        PassportUtil.marriageRegistrate(citizen1,citizen2);
        System.out.println("\nAfter marriage\n"+citizen1+"\n"+citizen2);

    }

}
