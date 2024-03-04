package Assignment5.Problem4;

public class SalariedEmployee extends Employee {
    double weeklySalary;

    @Override
    double getPayment() {
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    SalariedEmployee(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "Salary Provided is " + this.weeklySalary;
    }
}
