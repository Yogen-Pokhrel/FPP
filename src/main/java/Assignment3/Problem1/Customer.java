package Assignment3.Problem1;

public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public String getBillingAddress() {
        return billingAddress.toString();
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress.toString();
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    Customer(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = ssn;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

    public static void main(String[] args) {
        Customer[] allCustomers = new Customer[3];
        int customerIndex = 0;
        Customer customer1 = new Customer("Yogen", "Pokhrel", "567891234");
        Address billingAddress1 = new Address("US", "Illinois", "Chicago", "1852 W 19th st", "IL 60608");
        Address shippingAddress1 = new Address("US", "Iowa", "Fairfield", "1000 N 4th Street", "52557");
        customer1.setShippingAddress(shippingAddress1);
        customer1.setBillingAddress(billingAddress1);
        allCustomers[customerIndex++] = customer1;

        Customer customer2 = new Customer("Dikshya", "Prasai", "5634891");
        Address billingAddress2 = new Address("US", "Illinois", "Chicago", "333 W 35th st", "IL 60616");
        Address shippingAddress2 = new Address("US", "Iowa", "Fairfield", "1000 N 4th Street", "52556");
        customer2.setShippingAddress(shippingAddress2);
        customer2.setBillingAddress(billingAddress2);
        allCustomers[customerIndex++] = customer2;

        Customer customer3 = new Customer("Dev", "Kharel", "3453545");
        Address billingAddress3 = new Address("US", "Illinois", "Topeka", "333 W 35th st", "TL 60616");
        Address shippingAddress3 = new Address("US", "Iowa", "Fairfield", "1000 N 4th Street", "52556");
        customer3.setShippingAddress(shippingAddress3);
        customer3.setBillingAddress(billingAddress3);
        allCustomers[customerIndex++] = customer3;

        for(Customer x: allCustomers){
            if(x.billingAddress.getCity() == "Chicago"){
                System.out.println(x.toString());
            }
        }

    }
}
