package prog4;

import java.util.*;

public class Main {

    public static Employee findMaxSalary(Employee[] col) {
        if (col == null || col.length == 0) {
            return null;
        }
        else {
            Employee withMaxSalary = col[0];
            for (Employee temp : col) {
                if (temp.getPayment() > withMaxSalary.getPayment()) {
                    withMaxSalary = temp;
                }
            }
            return withMaxSalary;
        }
    }
    public static void main(String[] args) {
        findMaxSalary(null);

        Employee e1 = new CommissionEmployee("John", "Smith", "123-456-789", 2000, 0.10);
        Employee e2 = new HourlyEmployee("Alexander", "John", "678-678-213", 120, 45.6);
        Employee e3 = new SalariedEmployee("Jennifer", "Lopez", "123-456-789", 1230);
        Employee e4 = new BasePlusCommissionEmployee("Bruce", "Lee", "5678-321-456", 4560, 0.07, 789);

        Employee[] employees = {e1, e2, e3, e4};
        Employee maxSalary = findMaxSalary(employees);
        System.out.println(maxSalary);
    }
}
