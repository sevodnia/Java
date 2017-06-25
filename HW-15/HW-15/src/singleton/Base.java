package singleton;

public class Base {

    /*
    Var.No3
    с синхронизацией
     */
    private static Base base;

    private Base() {
    }

    public static synchronized Base getBase() {
        if (base == null) {

            base = new Base();

        }
        return base;
    }
}
