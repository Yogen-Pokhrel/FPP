package Assignment5.Problem4;

public class HourlyEmployee extends Employee{
    double wage;
    double hours;
    @Override
    double getPayment() {
        return wage * hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    HourlyEmployee(double hours, double wage){
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Wage provided is " + this.wage + " and number of hours is " + this.hours;
    }
}
