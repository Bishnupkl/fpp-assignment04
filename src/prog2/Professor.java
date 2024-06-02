package prog2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    Professor(String aName, double aSalary, LocalDate aHireDay, int numberOfPublications) {
        super(aName, aSalary, aHireDay);
        this.numberOfPublications = numberOfPublications;

    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
