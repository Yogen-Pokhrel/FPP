package Assignment5.Problem2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private LocalDate hireDay;
    protected double salary;
    DeptEmployee(String name, LocalDate hireDay, double salary){
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
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

    public double computeSalary(){
        return salary;
    }
}
