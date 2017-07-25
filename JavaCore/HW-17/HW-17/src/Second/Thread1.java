package Second;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread {
//for downloading

    Thread2 thread2;

    public Thread2 getThread2() {
        return thread2;
    }

    public void setThread2(Thread2 thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        System.out.println("Загружаем XML");
        ParseXML pxml = new ParseXML();
        Load.load(pxml);

        synchronized (thread2) {
            thread2.notifyAll();

        }
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
         System.out.println("Загружаем GSON");
        ParseGson gson = new ParseGson();
        Load.load(gson);

        synchronized (thread2) {
            thread2.notifyAll();

        }
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("The END!");
        
        
    }

}
