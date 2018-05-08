public class Square implements Shape {
    private float sideA;
    private String color;

    public Square(float sideA, String color) {
        this.sideA = sideA;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

    @Override
    public double calculatePerimeter() {
        return sideA * 4;
    }

    @Override
    public String toString() {
        return "Shape = Square," + " area= " + calculateArea() + ", Perimeter= " + calculatePerimeter() + ", Lenght side =  " + sideA + ", color= " + color;
    }
}
