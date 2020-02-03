package laba14;

import java.time.LocalDate;
import java.util.Objects;

public class Man {
    private String name;
    private LocalDate birthday;
    private String telephoneNumber;

    public Man(String name, String birthday, String telephoneNumber) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void SayHello(){
        System.out.println("Привет");
    }
    public void SayBye(){
        System.out.println("Досвидания");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", telephoneNumber=" + telephoneNumber +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return Objects.equals(name, man.name) &&
                Objects.equals(birthday, man.birthday) &&
                Objects.equals(telephoneNumber, man.telephoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, telephoneNumber);
    }
}
