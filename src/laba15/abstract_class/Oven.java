package laba15.abstract_class;

public class Oven extends AbstractMulticooker {
    void initTimer(int timer) {
        System.out.println("Установлен таймер на " + timer + " минут");
        powerOff();
    }

    @Override
    public void cook() {
        System.out.println("Печь готова готовить всё на свете");
        initTimer(30);
    }
}
