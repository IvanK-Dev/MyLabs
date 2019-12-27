package laba7;

public class Book {
    private String name="Книга";
    private double price=100.0;
    private static final boolean IN_STOCK= true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
    }
}
