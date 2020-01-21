package laba12.test;

import laba12.citizen.Passport;
//import laba12.transport.PassportUtil;

public class TransportMain {
    public static void main(String[] args) {
        Passport citizen1 = new Passport("CB466666", "Ivan", "Ivanov");
        Passport citizen2 = new Passport("CB499999", "Irina", "Petrova");
        laba12.transport.Passport car = new laba12.transport.Passport("Lada", "cedan", 95);
//        PassportUtil.changeOwner(car,citizen1);
//        System.out.println(car);
//     PassportUtil.changeOwner(car,citizen2);
        System.out.println(car);
        car.changeOwner(citizen1);
        System.out.println("******************************");
        System.out.println(car);

    }
}
