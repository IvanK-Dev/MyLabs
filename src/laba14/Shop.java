package laba14;

public class Shop {
    private String name;
    private String address;
    private Manager manager;
    private Cashier cashier;
    private Security security;
    private Client client;
    {
        this.manager=new Manager("Иванов Иван","1982-03-26","806611111");
        this.cashier=new Cashier("Петров Петр","1984-04-14","807822222");
        this.security=new Security("Сергеев Сергей","1990-05-17","807833333");
        this.client=new Client("Васильев Вася","1980-01-11","807844444");
    }

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Manager getManager() {
        return manager;
    }

    public Cashier getCashier() {
        return cashier;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", security=" + security +
                ", client=" + client +
                '}';
    }

    public void openUp(){
        System.out.println("Магазин открывается");
        security.comeToWork();
        manager.comeToWork();
        cashier.comeToWork();
    }
    public void goForLunch(){
        System.out.println("Магазин закрыт на обед");
        security.goForLunch();
        manager.goForLunch();
        cashier.goForLunch();
    }
    public void sellGoods(){
        System.out.println("Магазин продает товары");
        client.LearnAboutProduct();
        manager.work();
        client.Bue();
        cashier.work();
        security.work();
    }
}


