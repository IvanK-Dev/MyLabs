package laba15.abstract_class;

import laba15.interfaces.Caller;
import laba15.interfaces.EmailSender;

public class SmartPhone extends Mobile implements Caller, EmailSender {
    String os="IOS";
    public void runApp(){
        System.out.println("Запуск приложения на смартфоне");
        System.out.println(editMail("текстовый документ"));
    };

    @Override
    public void call() {
        System.out.println("Выбираем контакт из меню, звоним со смартфона");
    }

    @Override
    public String editMail(String mail) {
        System.out.println("Редактирование письма");
        return mail;
    }

    @Override
    public String createMail(String mail) {
        System.out.println("Создать письмо");
        return null;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Отправить письмо со смартфона");
    }
}
