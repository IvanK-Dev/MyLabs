package laba14;

public class Main {
    public static void main(String[] args) {
        Manager manager1=new Manager("Иванов Иван","1982-04-26","806611111");
        Cashier cashier=new Cashier("Петров Петр","1984-04-14","807822222");

        Shop shop=new Shop("QWERTY","Тута");
        shop.openUp();
        shop.sellGoods();
        shop.goForLunch();
        System.out.println(shop);
        System.out.println(shop.getManager().equals(manager1));
        System.out.println(shop.getCashier().equals(cashier));
    }
}
