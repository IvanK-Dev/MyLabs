package laba14;
import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Man {
    private LocalDate employmentDate;
    private double salary;
    private boolean presence;

    public Employee(String name, String birthday, String telephoneNumber) {
        super(name, birthday, telephoneNumber);
        setEmploymentDate();
        setSalary();
    }

//    private String GetFromConsole() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }

    private void setEmploymentDate() {
        System.out.print("Дата приема на работу? - ");

        this.employmentDate = LocalDate.parse(Util.GetFromConsole());
    }

    private void setSalary() {
        System.out.print("Зарплата? - ");
        this.salary = Double.parseDouble(Util.GetFromConsole());
    }

    public void comeToWork(){
        System.out.println("Сотрудник пришел на работу");
    }
    public void goForLunch(){
        System.out.println("Сотрудник обедает");
    }
    public void work(){
        System.out.println("Сотрудник работает");
    }


    @Override
    public String toString() {
        return "Employee{\n" +super.toString()+
                "\nemploymentDate=" + employmentDate +
                ", salary=" + salary +
                ", presence=" + presence +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                presence == employee.presence &&
                Objects.equals(employmentDate, employee.employmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employmentDate, salary, presence);
    }
}
