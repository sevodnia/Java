
import java.util.Arrays;




public class homeWork02 {
    
    public static void main(String[] args) {
        System.out.println("=========");
        System.out.println("Задание 1");
        array();
        System.out.println("=========");
        System.out.println("Задание 2 (только с помощью циклов)");
        array2();
        System.out.println("=========");
        System.out.println("Задание 2 (с использование дополнительного массива)");
        array3();
        System.out.println("=========");
        System.out.println("Задание 3");
        array4();
        System.out.println("=========");
        System.out.println("Задание 4");
        array5();
    }

//Задание №1
    public static void array() {
        
        int[] numbers = {51, 52, -606, -601, -9, -89, 56, 56, 54, -857};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        
        System.out.println("min value = " + min);
        System.out.println("max value = " + max);
        
        for (int i = 0; i < numbers.length; i++) {
            if (max == numbers[i]) {
                numbers[i] = 99;
            }
            if (min == numbers[i]) {
                numbers[i] = 0;
            }
        }
        
        System.out.print("[ ");
        for (int i = 0; i < (numbers.length); i++) {
            System.out.print(numbers[i] + ", ");
        }
        
        System.out.println(" ]");
        
    }

    //Задание №2
    public static void array2() {
        double[] numbers = {3, 3, 34, 2, 1, 2, 3, 1, 5, 6};
        
        int c = 0;
        double num;
        double res = 0;
        for (int i = 0; i < numbers.length; i++) {
            num = numbers[i];
            
            for (int b = 0; b < numbers.length; b++) {
                if (num == numbers[b]) {
                    c += 1;
                    
                    res = num;
                    
                }
                
            }
            if (c >= 2) {
                System.out.println("Повторяется " + res + " повторений " + c);
            }
            c = 0;
        }
        
    }

//задание #2 (с использованием дополнительного массива)
    public static void array3() {
        double[] mass = {2, 3, 5, 7, 3, 5, 7, 3, 7, 20};
        //печатаем исходный массив
        System.out.print("Исходный массив: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        Arrays.sort(mass);
        System.out.println();
        //печатаем отсортированный массив
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");

        //в NUM собираем повторения
        int num = 1;
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    num += 1;
                    i = j;
                    
                }
                
            }
            
            if (num >= 2) {
                System.out.println("[ " + mass[i] + " ] - повторений " + num);
                
                num = 1;
            }
            
        }
        
    }

    //задание 4
    public static void array4() {
        int[] mass1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] mass2 = new int[mass1.length];
        int b = mass1.length - 1;
//выводим на печать исходный массив
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i] + " ");
        }
        
        System.out.println();
//присваеваем значения одного массива в обратном порядке другому        
        for (int i = 0; i < mass1.length; i++) {
            mass2[b] = mass1[i];
            b--;
        }
//печатаем новый массив        
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i] + " ");
        }
        System.out.println();
    }

    //задание 4
    public static void array5() {
        int [] numbers = {51, 52, -606, -601, -9, -89, 56, 56, 54, -857};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
            
        }
        

    }
    
}
