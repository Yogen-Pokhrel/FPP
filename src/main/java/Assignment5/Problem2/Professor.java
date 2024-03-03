package Assignment5.Problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
    private int numberOfPublications;
    Professor(String name, LocalDate hireDay, double salary, int numberOfPublications){
        super(name, hireDay, salary);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
