package patternObserver;

import java.util.HashMap;
import java.util.Map;

public class EventManager implements Publish {

    HashMap<String, EventListener> listeners = new HashMap<>();

    @Override
    public void subscribe(String eventType, EventListener listener) {
        listeners.put(eventType, listener);
    }

    @Override
    public void unsubscribe(String eventType, EventListener listener) {
        listeners.remove(eventType, listener);
    }

    @Override
    public void notify(String eventType, String str) {

        for (String key : listeners.keySet()) {
            if (key.equals(eventType)) {
                listeners.get(key).update(str);
            }

        }

    }

    public void show() {

        for (Map.Entry<String, EventListener> entry : listeners.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

}
