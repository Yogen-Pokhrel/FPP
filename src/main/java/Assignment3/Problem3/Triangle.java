package Assignment3.Problem3;

import Assignment3.ErrorMessage;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

final public class Triangle {
    private final double base;
    private final double height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    Triangle(){
        this.base = this.getBaseFromScanner();
        this.height = this.getHeightFromScanner();
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    private double getBaseFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter base of triangle");
            try {
                double input = scanner.nextDouble();
                return input;
            } catch(Exception e) {
                ErrorMessage.printError("Error! Please try again");
                scanner.nextLine();
            }
        }
    }

    private double getHeightFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter height of triangle");
            try {
                double input = scanner.nextDouble();
                return input;
            } catch(Exception e) {
                ErrorMessage.printError("Error! Please try again");
                scanner.nextLine();
            }
        }
    }

    public double computeArea(){
        return (this.base * this.height) / 2;
    }
}
