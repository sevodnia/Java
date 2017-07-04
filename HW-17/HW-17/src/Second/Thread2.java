package Second;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread2 extends Thread {
    //for parsing

    Thread1 thread1;

    public Thread1 getThread1() {
        return thread1;
    }

    public void setThread1(Thread1 thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }

            ParseXML pxml = new ParseXML();
            Root root = pxml.parseFile();
            Iterator<Student> iter = root.getStudents().iterator();
            while (iter.hasNext()) {
                iter.next().print();
            }

        }

        synchronized (thread1) {

            thread1.notifyAll();

        }

        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Начинаем парсить GSON");
        ParseGson gson = new ParseGson();
        Root root2 = gson.parseFile();
        System.out.println("Заканчиваем парсить GSON");
        Iterator<Student> iter2 = root2.getStudents().iterator();
        while (iter2.hasNext()) {
            iter2.next().print();
        }

        synchronized (thread1) {
            thread1.notifyAll();
        }

    }

}
