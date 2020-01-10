package laba9;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] arr= {
                new Pizza("first", "Сыр, томаты, ветчина", 120, 20),
                new Pizza("second", "Сыр, томаты, ветчина", 130, 22),
                new Pizza("third", "Сыр, томаты, ветчина", 140, 24),
                new Pizza("fourth", "Сыр, томаты, ветчина", 150, 26)
        };
        for(Pizza p:arr){
            p.pizzaInfo();
        };

    }
}
