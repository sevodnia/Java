package patternObserver;

public interface Publish {

    public void subscribe(String eventType, EventListener listener);

    public void unsubscribe(String eventType, EventListener listener);

    public void notify(String eventType, String str);

}
