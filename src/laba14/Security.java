package laba14;

public class Security extends Employee {
    public Security(String name, String birthday, String telephoneNumber) {
        super(name, birthday, telephoneNumber);
    }

    public void talkOnTheWalkieTalkie() {
        System.out.println("Охранник говорит по рации");
    }

    @Override
    public void work() {
        System.out.println("Охранник работает");
    }

    @Override
    public void comeToWork() {
        System.out.println("Охранник пришел на работу");
    }

    @Override
    public void goForLunch() {
        System.out.println("Охранник обедает");
    }

    @Override
    public String toString() {
        return "Security{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
