package laba14;

import java.util.Objects;

public class Manager extends Employee {
    private String department;


    public Manager(String name, String birthday, String telephoneNumber) {
        super(name, birthday, telephoneNumber);
        setDepartment();
    }

    private void setDepartment() {
        System.out.print(" Отдел - ");
        this.department = Util.GetFromConsole();
    }

    public void сonsult() {
        System.out.println("Консультант рассказывает о товаре");
    }

    public void talkAboutDiscounts() {
        System.out.println("Консультант рассказывает о скидках");
    }

    public void recommend() {
        System.out.println("Консультант рекоммендует товар");
    }

    @Override
    public void work() {
        System.out.println("Консультант работает");
    }

    @Override
    public void comeToWork() {
        System.out.println("Консультант пришел на работу");
    }

    @Override
    public void goForLunch() {
        System.out.println("Консультант обедает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}
