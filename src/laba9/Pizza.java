package laba9;

public class Pizza {
    private Circle basis;
    private String composition;
    private String name;
    private double cost;

    public Pizza(String name, String composition, double cost, double diam) {
        this.basis = new Circle(diam / 2);
        this.composition = composition;
        this.name = name;
        this.cost = cost;
    }

    public void pizzaInfo() {
        System.out.println("\nname - " + name
                + "\ncomposition - " + composition
                + "\nDiam - " + basis.getRadius() * 2
                + "\nCost - " + cost);
    }
}
