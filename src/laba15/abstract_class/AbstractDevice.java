package laba15.abstract_class;

public abstract class AbstractDevice {
    String name;
    Integer serial;

    public AbstractDevice() {
        powerOn();
    }

    abstract void powerOn();

    public abstract void powerOff();
}
