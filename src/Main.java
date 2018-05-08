import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        String nameShape;
        float sideA;
        float sideB;
        float sideC;
        String colorShape;

        while (true) {
            System.out.println("Введите название фигуры: ");
            nameShape = scanner.next();
            System.out.println("Введите длину стороны A: ");
            sideA = scanner.nextFloat();
            System.out.println("Введите цвет фигуры: ");
            colorShape = scanner.next();

            if (nameShape.equals("Square")) {
                shapes.add(new Square(sideA, colorShape));
            }
            if (nameShape.equals("Circle")) {
                shapes.add(new Circle(sideA, colorShape));
            }
            if (nameShape.equals("Triangle")) {
                System.out.println("Введите длину стороны B: ");
                sideB = scanner.nextFloat();
                shapes.add(new Triangle(sideA, sideB, colorShape));
            }
            if (nameShape.equals("Trapezium")) {
                System.out.println("Введите длину стороны B: ");
                sideB = scanner.nextFloat();
                System.out.println("Введите длину стороны C: ");
                sideC = scanner.nextFloat();
                shapes.add(new Trapezium(sideA, sideB, sideC, colorShape));
            }
            for (Shape shape : shapes) {
                System.out.println(shape.toString());
            }

            System.out.println("Добавить ещё фигуру (Yes)1/0(no)?");

            if (scanner.nextInt() == 0) {
                break;
            }
        }
    }
}
