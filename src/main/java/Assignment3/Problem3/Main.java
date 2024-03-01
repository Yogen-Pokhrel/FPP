package Assignment3.Problem3;

import Assignment3.ErrorMessage;

import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Main {
    public enum Shape {
        TRIANGLE("T"),
        RECTANGLE("R"),
        CIRCLE("C");
        private final String notation;

        Shape(String notation) {
            this.notation = notation;
        }

        public String getNotation() {
            return notation;
        }

        public static boolean isValidLabel(String label) {
            for (Shape shape : values()) {
                if (shape.getNotation().equals(label)) {
                    return true;
                }
            }
            return false;
        }

        public static Shape getLabel(String inputLabel) {
            for (Shape shape : values()) {
                if (shape.getNotation().equals(inputLabel)) {
                    return shape;
                }
            }
            return null; // Return null for invalid labels
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            action();
            System.out.println("Do you want to perform the next calculation, if Yes type Y or Yes");
            String input = scanner.nextLine().toUpperCase();
            if(!(input.equals("Y") || input.equals("YES"))){
                break;
            }
        }
    }

    public static void action(){
        Scanner scanner = new Scanner(System.in);
        Shape choosenShape;
        while (true){
            System.out.println("Please choose the shape from ");
            for (Shape shape : Shape.values()) {
                System.out.println(shape.name() + ": " + shape.getNotation());
            }

            String text = scanner.nextLine().toUpperCase();
            if(Shape.isValidLabel(text)){
                choosenShape = Shape.getLabel(text);
                break;
            }else{
                ErrorMessage.printError("Invalid symbol, please try again");
            }
        }

        if(choosenShape != null){
            switch (choosenShape){
                case CIRCLE :
                    System.out.println("Great! You have chosen circle");
                    Circle c = new Circle();
                    System.out.println("The area of the circle is " + c.computeArea());
                    break;

                case RECTANGLE:
                    System.out.println("Great! you have chosen Rectangle");
                    Rectangle r = new Rectangle();
                    System.out.println("The area of the rectangle is " + r.computeArea());
                    break;

                case TRIANGLE:
                    System.out.println("Great! you have chosen Triangle");
                    Triangle t = new Triangle();
                    System.out.println("The area of the triangle is " + t.computeArea());
                    break;

                default:
                    System.out.println("Unknown shape chosen");

            }
        }
    }

}
