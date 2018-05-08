public class Trapezium implements Shape {
    private float sideA;
    private float sideB;
    private float sideC;
    private String color;

    public Trapezium(float sideA, float sideB, float sideC, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        double h = Math.sqrt(Math.pow(0.5 * (sideB - sideA), 2) + Math.pow(sideC, 2));
        return 0.5 * (sideA + sideB) * h;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC + sideC;
    }

    @Override
    public String toString() {
        return "Shape = Trapezium," + " area= " + calculateArea() + ", Perimeter= " + calculatePerimeter() + ", color= " + color;
    }
}
