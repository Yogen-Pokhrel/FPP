package Assignment3.Problem3;

import Assignment3.ErrorMessage;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

final public class Rectangle {
    private final double width;
    private final double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    Rectangle(){
        this.height = this.getHeightFromScanner();
        this.width = this.getWidthFromScanner();
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    private double getHeightFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter height of rectangle");
            try {
                double input = scanner.nextDouble();
                return input;
            } catch(Exception e) {
                ErrorMessage.printError("Error! Please try again");
                scanner.nextLine();
            }
        }
    }

    private double getWidthFromScanner(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter width of rectangle");
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
        return this.height * this.width;
    }
}
