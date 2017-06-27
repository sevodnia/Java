package TwoStreams;

public class Stream extends Thread {

    @Override
    public void run() {
    Main.print10(this);
        
        /*
        int number = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(getName() + " ");
            for (int a = 0; a < 10; a++) {

                System.out.print(number + " ");
                number++;

            }
            System.out.println(" ");
        }
    */    
        

    }

}
