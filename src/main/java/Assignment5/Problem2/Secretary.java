package Assignment5.Problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

    private double overtimeHours;
    Secretary(String name, LocalDate hireDay, double salary){
        super(name, hireDay, salary);
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return salary + 12 * overtimeHours;
    }
}
