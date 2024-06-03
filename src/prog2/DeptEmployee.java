package prog2;

import java.time.LocalDate;

public class DeptEmployee {

    private String name;
    private LocalDate hireDate;
    private double salary;
    // constructor
    public DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public double computeSalary(){
        return salary;
    }
}
