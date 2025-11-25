package Basics;

public class AreaCalculator {

    double calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    int calculateArea(int side) {
        int area = side * side;
        return area;
    }

    int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
        AreaCalculator area = new AreaCalculator();
        System.out.println(area.calculateArea(6));
        System.out.println(area.calculateArea(6, 8));
        System.out.println(area.calculateArea(6.5));
    }
}
