package Assignment5.Problem4;

public class Driver {
    public static void main(String[] args) {
        Employee[] allEmployees = {
                new BasePlusCommissionEmployee(4000, 120000, 5),
                new CommissionEmployee(64000, 3),
                new SalariedEmployee(12000),
                new HourlyEmployee(48, 45)
        };

        System.out.println("Current salary status is as below:");
        for(Employee e: allEmployees){
            System.out.println(e.getClass().getSimpleName() + ": " + e.toString());
        }

        System.out.println("Total salary to pay is "+calculateTotalSalary(allEmployees));

    }

    static double calculateTotalSalary(Employee[] allEmployees){
        double total = 0;
        for(Employee e: allEmployees){
            total += e.getPayment();
        }
        return total;
    }


}
