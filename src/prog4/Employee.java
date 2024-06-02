package prog4;

abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract double getPayment();

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + "\n" +
                "Social Security Number: " + socialSecurityNumber;
    }
}
