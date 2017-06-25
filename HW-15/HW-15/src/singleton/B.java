package singleton;


public class B {

    /*
    Var.No4
    Собственная реализация SingleTone на основе lock переменной
     */
    private static B instance;
    private static String name;
    private static int lock = 0;

    private B() {

    }

    public static B getInstance() {
        if (lock == 0) {
            instance = new B();
            lock = 1;
        }

        return instance;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        B.name = name;
    }

}
