class Circle{
    private double radius;

    // Default constructor
    public Circle() {
        radius = 1.0;
    }

    // Constructor with one parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate the area of the circle
    public double getArea() {
        return 3.14159 * radius * radius;
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create a circle using the default constructor
        Circle c1 = new Circle();
        System.out.println("The area of circle c1 is " + c1.getArea());

        // Create a circle using the constructor with one parameter
        Circle c2 = new Circle(5.0);
        System.out.println("The area of circle c2 is " + c2.getArea());
    }
}
