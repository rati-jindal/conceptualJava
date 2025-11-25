package Shapes;

abstract class Shape {
    //    (Notice the semicolon! No body).
    abstract double calculateArea();

    void display() {
        System.out.println("This is a Shape");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(2.5);
        Shape s2 = new Rectangle(12, 13);

        System.out.println(s1.calculateArea() + " " + s2.calculateArea());

    }

}
