package laba15.abstract_class;

abstract class AbstractMulticooker extends AbstractDevice {

    @Override
    void powerOn() {
       System.out.println("Втыкаем вилку в розетку, печь включается.");
    }

    @Override
    public void powerOff() {
       System.out.println("Вытыкаем вилку из розетку, печь выключается.");
    }

    abstract void cook();
}
