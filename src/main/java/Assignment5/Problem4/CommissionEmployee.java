package Assignment5.Problem4;

public class CommissionEmployee extends Employee {
    double grossSales;
    /** Commission Rate is in percentage*/
    double commissionRate;

    @Override
    double getPayment() {
        return grossSales * (commissionRate / 100);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    CommissionEmployee(double grossSales, double commissionRate){
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "Gross sales provided is " + this.grossSales + " and commission rate provided is (in percentage) " + this.commissionRate;
    }
}
