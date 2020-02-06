package laba15.abstract_class;

import laba15.interfaces.Caller;

public class DialPhone extends Phone implements Caller {
    private String hasAnswerPhone;

    @Override
    public void call() {
       System.out.println("Поднимаем трубку, набираем номер, звоним.");
    }

    @Override
    public void powerOn() {
       System.out.println("Подключаем стационарный телефон к сети.");
    }

    @Override
    public void powerOff() {
       System.out.println("Выключаем стационарный телефон из сети.");
    }

    public void autoAnswer() {
       System.out.println("Прошло 5 гудков, включается автоответчик");
    }
}
