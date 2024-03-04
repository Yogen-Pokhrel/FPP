package Assignment5.Problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    @Override
    double getPayment() {
        return baseSalary + super.getPayment();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    BasePlusCommissionEmployee(double baseSalary, double grossSales, double commissionRate){
        super(grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Base Salary provided is " + this.baseSalary;
    }
}
