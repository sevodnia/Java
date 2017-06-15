package calcWithException;

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

        try {
            result = a / b;

            throw new MyException(4);
        } catch (MyException ex) {

            System.out.println("Вы пытаетесь делить на ноль");
        }

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

    public void ex(String string) throws MyException {
        if (string.contains("@")) {

            throw new MyException(5);
        }
    }

}
