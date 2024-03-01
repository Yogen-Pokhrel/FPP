package Assignment4.Problem1;

public class IntegerReversePrint {
    public static void main(String[] args) {
        print(45623);
    }

    public static void print(int n){
        if(n <= 0){
            return;
        }
        int lastDigit = n % 10;
        System.out.println(lastDigit);
        print(n/10);
    }
}
