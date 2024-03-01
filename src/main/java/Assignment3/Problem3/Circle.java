package Assignment3.Problem3;

import Assignment3.ErrorMessage;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

final public class Circle {
    private final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    Circle(){
        this.radius = this.getRadiusFromScanner();
    }

    public double getRadius(){
        return this.radius;
    }

    private double getRadiusFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter radius of circle");
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
        return Math.PI * Math.pow(radius, 2);
    }

}
