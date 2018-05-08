public class Circle implements Shape {
    private float sideA;
    private String color;

    public Circle(float sideA, String color) {
        this.sideA = sideA;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(sideA, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * sideA;
    }

    @Override
    public String toString() {
        return "Shape = Circle," + " area = " + calculateArea() + ", Perimeter = " + calculatePerimeter() + ", color = " + color;
    }
}
