package Assignment5.Problem1;

public class Circle extends Shape {
    final double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
