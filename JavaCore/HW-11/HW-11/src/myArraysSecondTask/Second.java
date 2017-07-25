package myArraysSecondTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
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

        //теперь нам нужно удалить дубликаты
        //красивая реализация с коллекцией HashSet
        //для этого исходный ArrayList перезаписываем в HashSet;
        /*
        HashSet<String> set = new HashSet<>(array);
        array.clear();
        array.addAll(set);
        
         */
        //сложная реализация удаления дубликатов с двумя циклами for 
        for (int b = 0; b < array.size(); b++) {
            //берем элементы один за одним и сравниваем с каждым
            for (int i = b + 1; i < array.size();) {
                //если элемент №0 равен элементу №1 и т.д.
                if (array.get(b).equals(array.get(i))) {

                    array.remove(i);
                    //когда удаляем элемент из массива, остаток сдвигается влево, возвращаем счетчик на место
                    continue;
                }
                i++;

                //когда один сравнили со всеми, переходим к следующему
            }
        }

        //для красивого вывода берем итератор
        ListIterator<String> itr = array.listIterator();
        System.out.print("Your the third array is ");
        while (itr.hasNext()) {
            System.out.print("|" + itr.next() + "|");

        }
    }

}
