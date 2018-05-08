public class Triangle implements Shape {
    private float sideA;
    private float sideB;
    private String color;

    public Triangle(float sideA, float sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        double h = Math.sqrt(sideA * sideA - Math.pow(0.5 * sideA, 2));
        return 0.5 * h * sideA;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * sideA;
    }

    private double calculateHypotenuse() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    @Override
    public String toString() {
        return "Shape = Triangle," + " area= " + calculateArea() + ", Perimeter= " + calculatePerimeter() + ", Hypotenuse = " + calculateHypotenuse() + ", color= " + color;
    }
}
