package Assignment8.Problem1;
public class Person {
    private String lastName;
    private String firstName;
    private int age;
    // --------------------------------------------------------------
    public Person(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }
    // --------------------------------------------------------------
    public String getLast() // get last name
    {
        return lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName + " FirstName=" + firstName + " Age=" + age + "]";
    }
}