package laba12.technics;

import java.util.Date;

public class Passport {
    private String producer;
    private String kind;
    private double price;
    protected Date warrantyStartDate = new Date();

    public Passport(String producer, String kind, double price) {
        this.producer = producer;
        this.kind = kind;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nPassport" +
                "\nproducer -" + producer +
                "\nkind - " + kind +
                "\nprice - " + price +
                "\nwarrantyStartDate -" + warrantyStartDate;
    }
}
