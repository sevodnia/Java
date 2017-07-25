package patternObserver;

public class Client {

    public static void main(String[] args) {
        EventManager em = new EventManager();

        for (int i = 0; i < 10; i++) {

            Subscriber el = new Subscriber();
            em.subscribe("DataOpen", el);
            Subscriber el2 = new Subscriber();
            em.subscribe("DataClose", el2);
            em.show();
        }

        em.notify("DataOpen", "is open");

        em.show();

    }

}
