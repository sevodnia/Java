package calcWithNoExeption;

public class Calc {

    private double result;

    public double getResult() {
        return result;
    }

    public double multiplication(double a, double b) {
        result = a * b;

        return result;

    }

    public double division(double a, double b) {
        result = a / b;
        return result;
    }

    public double addition(double a, double b) {
        result = a + b;
        return result;
    }

    public double subtraction(double a, double b) {
        result = a - b;
        return result;
    }

}
