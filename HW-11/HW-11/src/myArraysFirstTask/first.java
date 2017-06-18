package myArraysFirstTask;

import java.util.ArrayList;
import java.util.Scanner;

public class first {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();
        //объявляем переменную для остановки ввода 
        String stopper = "stop";
        //переключатель
        String start = "ada";
        Scanner scan = new Scanner(System.in);

        while (!start.equals(stopper)) {
            System.out.println("Fill the element of the list");
            String element = scan.nextLine();
            if (element.equals(stopper)) {
                System.out.println("It's complited.");
                break;
            } else {
                array.add(element);

            }

        }

        System.out.println("Your the first array is " + array);

        for (int i = 0; i < array.size(); i++) {
            if ( /*когда содержит английскую "а" */array.get(i).contains("a")) {
                String str = array.get(i);
                array.set(i, str.replace("a", ""));
            }
        }

        System.out.println("Your the second array is " + array);

    }

}
