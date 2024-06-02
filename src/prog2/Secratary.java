package prog2;

import java.time.LocalDate;

public class Secratary extends DeptEmployee {

    private double overtimeHours;

    Secratary(String aName, double aSalary, LocalDate aHireDay, double overtimeHours) {
        super(aName, aSalary, aHireDay);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double computeSalary() {
        return super.computeSalary() + (12 * overtimeHours);
    }



}
