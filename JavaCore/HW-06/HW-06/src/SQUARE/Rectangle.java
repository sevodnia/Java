package SQUARE;

public class Rectangle extends Shape {


    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }



   
    @Override
    public double count() {
        square = getSideA() * getSideB();

        return square;
    }

}
