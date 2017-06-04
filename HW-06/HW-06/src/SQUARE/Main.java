package SQUARE;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Прямоугольник", 20, 20);
        showSquare(rectangle);

        Square square = new Square("Квадрат", 12);
        showSquare(square);

        Circle circle = new Circle("Круг", 10);
        showSquare(circle);

        Triangle triangle=new Triangle("Треугольник", 3, 4, 5);
        showSquare(triangle);
    }

    public static void showSquare(Shape s) {
        System.out.println(s.getName() + "а площадь=" + s.count());

    }
}
