package calcWithException;

public class MyException extends Exception {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MyException(int code) {
        this.code = code;
    }

    public void getRussianMessage() {

        System.out.println("Введенные вами данные не соответсвуют регулярному выражению");

    }

}
