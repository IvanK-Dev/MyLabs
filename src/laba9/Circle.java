package laba9;

public class Circle {
    private double radius;
    private double circumference;
    private double s;
    private String color;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
        circlePerimeter();
        circleArea();
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        circlePerimeter();
        circleArea();
    }

    private void circlePerimeter() {
        this.circumference = 2 * PI * this.radius;
    }

    private void circleArea() {
        this.s = PI * radius * radius;
    }

    public void Show() {
        System.out.println("Радиус : " + radius
                + "\nДлинна окружности : " + circumference
                + "\nПлощадь : " + s
                + "\nЦвет : " + (color==null?"отсутствует":color));
    }
}

