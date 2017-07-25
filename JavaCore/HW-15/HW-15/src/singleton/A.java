package singleton;

public class A {

    private static A instance;
    private String name = "YEAH!";

    private A() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class GiveMeA {

        private static int LOCK = 0;

        public A giveMeA() {

            if (LOCK == 0) {
                instance = new A();
                LOCK = 1;
            }
            return instance;
        }

    }

}
