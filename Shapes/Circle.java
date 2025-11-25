package Shapes;

public class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (3.14 * radius * radius);
    }
}
