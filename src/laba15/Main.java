package laba15;

import laba15.abstract_class.*;
import laba15.interfaces.MailSender;

public class Main {
    public static void powerOffAllDevices(AbstractDevice... obj) {
        for (int i = 0; i < obj.length; i++) {
            obj[i].powerOff();
        }
    }

    public static void forMailSender (MailSender ... obj){
        for (int i = 0; i < obj.length; i++) {
            obj[i].sendMail("ТРА та та");
        }
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.runApp();
        DialPhone dialPhone = new DialPhone();
        dialPhone.powerOn();
        dialPhone.call();
        dialPhone.autoAnswer();
        dialPhone.powerOff();

        Multicooker multicooker = new Multicooker();
        multicooker.cook();

        Oven oven = new Oven();
        oven.cook();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        powerOffAllDevices(smartPhone, dialPhone, multicooker);
        System.out.println();
        forMailSender(smartPhone);
    }
}
