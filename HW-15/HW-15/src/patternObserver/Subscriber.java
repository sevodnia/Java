package patternObserver;

public class Subscriber implements EventListener {
//подписчик тип

    private String name = "Listener 1";

    private String something;

    @Override
    public String toString() {
        return "Subscriber{" + "name=" + name + ", something=" + something + '}';
    }

    public String getName() {
        return name;
    }

    public String getSomething() {
        return something;
    }

    
    
    
    
    @Override
    public void update(String str) {
        something = str;
    }

}
