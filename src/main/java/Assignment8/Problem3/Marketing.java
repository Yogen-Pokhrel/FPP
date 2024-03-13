package Assignment8.Problem3;

import java.util.*;

public class Marketing {
    String employeeName;
    String productName;
    double salesAmount;

    Marketing(String employeeName, String productName, double salesAmount ){
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "\n\tEmployee name: " + employeeName + " Product Name: " + productName + " Sales Amount: " + salesAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marketing marketing = (Marketing) o;
        return Double.compare(salesAmount, marketing.salesAmount) == 0 && Objects.equals(employeeName, marketing.employeeName) && Objects.equals(productName, marketing.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> filteredList = new ArrayList<>();
        for(Marketing m: list){
            if(m.salesAmount > 1000){
                filteredList.add(m);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(new Marketing("Yogen Pokhrel", "Macbook Pro", 1000.0));
        marketingList.add(new Marketing("Dikshya Pokhrel", "Plastic Bottle", 200.0));
        marketingList.add(new Marketing("Manjari Lamsal", "Asus Laptop", 1000.0));
        marketingList.add(new Marketing("Sameekshya Prasai", "Camera", 500.0));
        marketingList.add(new Marketing("Ghriti Prasai", "Washing Machine", 5000.0));
        marketingList.remove(1);
        System.out.println("Marketing current size is " + marketingList.size());
        System.out.println("All Marketing list are as follows");
        System.out.println(marketingList + "\n");

        //sorting using sales amount
        marketingList.sort((o1, o2) -> {
            int salesDiff = (int)Math.ceil(o1.salesAmount - o2.salesAmount);
            if(salesDiff != 0){return salesDiff;}
            if(o1.employeeName.compareTo(o2.employeeName) != 0){return o1.employeeName.compareTo(o2.employeeName);}
            return o1.productName.compareTo(o2.productName);
        });

        System.out.println("Sorted Marketing List");
        System.out.println(marketingList+"\n");

        //getting all sales higher than 10000
        List<Marketing> higherThan1000 = listMoreThan1000(marketingList);
        higherThan1000.sort((o1, o2) -> o1.employeeName.compareTo(o2.employeeName));
        System.out.println("Sorted Marketing List with employee names and whose sales amount is higher than 1000");
        System.out.println(higherThan1000);
    }

}
