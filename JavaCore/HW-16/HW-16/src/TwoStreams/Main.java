package TwoStreams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = "start";
        System.out.println("Type \"start\" to start: ");
        
        if(str.equals(scan.nextLine())){
        Stream streamOne = new Stream();
        streamOne.setName("Thread 1:");
        streamOne.start();
        Stream streamTwo = new Stream();
        streamTwo.setName("Thread 2:");
        streamTwo.start();
        }
        else{System.out.println("Incorrect.");}
        }

    public synchronized static void print10(Stream stream) {
        int number = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(stream.getName() + " ");
            for (int a = 0; a < 10; a++) {

                System.out.print(number + " ");
                number++;

            }
            System.out.println(" ");
        }

    }

}
