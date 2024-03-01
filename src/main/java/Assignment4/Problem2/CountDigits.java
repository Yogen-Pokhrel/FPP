package Assignment4.Problem2;

public class CountDigits {
    public static void main(String[] args) {
        int n = 191;
        int totalDigits = count(n);
        System.out.println("Total digits in " + n + " is "+ totalDigits);
    }

    public static int count(int n){
        if(n <= 0){
            return 0;
        }
        return 1 + count(n / 10);
    }
}
