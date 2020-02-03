package laba14;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.time.LocalDate;

public class Client extends Man {

    private String diskontCard;
    private double money;

    private void setDiskontCard() {
        System.out.print("Номер дисконтв - ");
        this.diskontCard = Util.GetFromConsole();
    }

    private void setMoney() {
        System.out.print("Количество денег у клиента - ");
        this.money = Double.parseDouble(Util.GetFromConsole());
    }

    public Client(String name, String birthday, String telephoneNumber) {
        super(name, birthday, telephoneNumber);

        setDiskontCard();
        setMoney();

    }

    public void LearnAboutProduct(){
        System.out.println("Клиент узнает про товар");
    }
    public void  Bue(){
        System.out.println("Клиент покупает товар");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Client{" +
                "diskontCard='" + diskontCard + '\'' +
                ", money=" + money +
                "} " + super.toString();
    }
}
