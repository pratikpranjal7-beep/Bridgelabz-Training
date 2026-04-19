class Circle2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleClass {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(5);
        c1.display();
    }
}
