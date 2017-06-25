package singleton;

public class Main {

    public static void main(String[] args) {

        Database data = Database.getInstace();
        BigDataBase bigData = BigDataBase.getBigDataBase();
        Base base = Base.getBase();

        //просто проверка, все ли работает
        B obj = B.getInstance();
        obj.setName("J. Lennon");
        System.out.println(obj.getName());
        B obj2 = B.getInstance();
        obj2.setName("R.Star");
        System.out.println(obj2.getName());
        System.out.println(obj.getName());

        A a = new A.GiveMeA().giveMeA();
        a.setName("HAMAM");
        System.out.println(a.getName());

        A.GiveMeA object2 = new A.GiveMeA();
        A b = object2.giveMeA();
        b.setName("GHKJS");
        System.out.println(b.getName());
        System.out.println(a.getName());

        C c = C.returnC();
        c.setName("VANO");
        System.out.println(c.getName());

        C d = C.returnC();
        d.setName("SULEJKO");
        System.out.println(d.getName());
        System.out.println(c.getName());
    }

}
