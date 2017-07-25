package Second;

public class Main {

    /*
    Главный класс - точка входа в программу
   
     */
    public static void main(String[] args) {

        
        
        Thread1 thread1  = new Thread1();
        Thread2 thread2  = new Thread2();
        thread1.setThread2(thread2);
        thread2.setThread1(thread1);
        
        thread1.start();
        thread2.start();
        
    }

}
