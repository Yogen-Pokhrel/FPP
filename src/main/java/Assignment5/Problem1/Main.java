package Assignment5.Problem1;

public class Main {
    public static void main(String[] args) {
        Shape[] allShapes = new Shape[6];
        allShapes[0] = new Circle("red", 12);
        allShapes[1] = new Rectangle("brown", 14, 24);
        allShapes[2] = new Square("black", 20);
        allShapes[3] = new Square("purple", 18);
        allShapes[4] = new Circle("pink", 18);
        allShapes[5] = new Rectangle("white", 18, 18);
        printTotal(allShapes);
    }

    public static void printTotal(Shape[] shapes){
        for(Shape eachShape : shapes){
            System.out.println("Area of " + eachShape.getClass().getSimpleName() + " for the provided value is " + eachShape.calculateArea());
            System.out.println("Perimeter of " + eachShape.getClass().getSimpleName() + " for the provided value is " + eachShape.calculatePerimeter() + "\n");
        }
    }
}
