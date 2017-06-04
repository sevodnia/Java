package ARRAYS;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int array2[] = new int[20];
        Random rand = new Random();

        //заполняем первый массив рандомными данными
        for (int a = 0; a < array1.length; a++) {
            array1[a] = rand.nextInt(array1.length + 1);
        }

        // выводим значения первого массива
        System.out.println("Начальный массив");
        System.out.print("[");
        for (int a = 0; a < array1.length; a++) {
            System.out.print(" " + array1[a] + ", ");
        }
        System.out.print("]");

        
        
        System.arraycopy(array1, 0, array2, 5, array1.length);
        
        System.out.println("");
                // выводим значения второго массива
        System.out.println("Второй массив");
        System.out.print("[");
        for (int a = 0; a < array2.length; a++) {
            System.out.print(" " + array2[a] + ", ");
        }
        System.out.print("]");
        
    }
}
