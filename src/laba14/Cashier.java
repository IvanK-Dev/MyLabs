package laba14;

import java.util.Objects;

public class Cashier extends Employee {
    private int cashDeskNumber;

    public Cashier(String name, String birthday, String telephoneNumber) {
        super(name, birthday, telephoneNumber);
        setCashDeskNumber();
    }


    private void setCashDeskNumber() {
        System.out.println(" Касса № - ");
        this.cashDeskNumber = Integer.parseInt(Util.GetFromConsole());
    }

    public void toCountMoney() {
        System.out.println("Кассир считает деньги");
    }

    @Override
    public void work() {
        System.out.println("Кассир работает");
    }

    @Override
    public void comeToWork() {
        System.out.println("Кассир пришел на работу");
    }

    @Override
    public void goForLunch() {
        System.out.println("Кассир обедает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cashier cashier = (Cashier) o;
        return cashDeskNumber == cashier.cashDeskNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cashDeskNumber);
    }
}
