package prog2;

import java.time.LocalDate;

public class DeptEmployee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    DeptEmployee(String aName, double aSalary, LocalDate aHireDay) {
        name = aName;
        salary = aSalary;
        hireDay = aHireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public double computeSalary() {
        return salary;
    }
}
