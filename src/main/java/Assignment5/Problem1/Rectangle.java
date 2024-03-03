package Assignment5.Problem1;

public class Rectangle extends Shape {
    final double width;
    final double height;
    Rectangle(String color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return this.height * this.width;
    }
    @Override
    double calculatePerimeter(){
        return 2 * (this.height + this.width);
    }
}
