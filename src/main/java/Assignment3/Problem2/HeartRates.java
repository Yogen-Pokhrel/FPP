package Assignment3.Problem2;

public class HeartRates {
    private static final int RESTING_HEART_RATE = 70;
    private static final float LOWER_BOUNDARY = 0.5f;
    private static final float UPPER_BOUNDARY = 0.85f;

    Person person;
    int maxHeartRate;
    int averageHeartRate;
    HeartRates(){
        this.person = new Person();
        int personAge = this.person.getAge();
        int personMaxHeartRate = this.maxHeartRate();
        int averageHeartRate = this.averageHeartRate();
        this.printTargetHeartRate();
        this.toString(this.person);
    }

    //overriding a toString Method
    public void toString(Person person){
        System.out.println("First Name: "+ person.getFirstName());
        System.out.println("Last Name: "+ person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Date of Birth: "+ person.getBirthday().toString());
        System.out.println("Maximum Heart Rate: " + this.maxHeartRate);
    }

    public int maxHeartRate(){
        int maxHeartRate = 220 - this.person.getAge();
        this.maxHeartRate = maxHeartRate;
        return maxHeartRate;
    }

    public int averageHeartRate(){
        int averageHeartRate = this.maxHeartRate - RESTING_HEART_RATE;
        this.averageHeartRate = averageHeartRate;
        return averageHeartRate;
    }

    public float lowerBoundaryTargetHeartRate(){
        return (LOWER_BOUNDARY * this.averageHeartRate) + RESTING_HEART_RATE;
    }

    public float upperBoundaryTargetHeartRate(){
        return (UPPER_BOUNDARY * this.averageHeartRate) + RESTING_HEART_RATE;
    }

    public void printTargetHeartRate(){
        float lbthr = this.lowerBoundaryTargetHeartRate();
        float ubthr = this.upperBoundaryTargetHeartRate();
        System.out.println("The Target Heart Range is Between " + lbthr + " and " + ubthr);
    }

    public static void main(String[] args) {
        HeartRates h1 = new HeartRates();
    }
}
