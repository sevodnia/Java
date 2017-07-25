
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork03 {

    public static void main(String[] args) {
        int[] mass = new int[10];
        int value = 0;
        for (int i = 0; i < mass.length; i++) {
            //получаем значения массива
            mass[i] = getter(value);

        }
        //выводим на экран значения массива
        display(mass);
//даем пользователю возможность выбора варианта сортировки
        System.out.println("\nВыберите способ сортировки по возрастанию \n "
                + "1 - Bubble sort \n 2 - Selection sort \n 3- sort() из "
                + "класса Arrays");

        switch (getter(value)) {
            case 1: {
                bubbleSort(mass);
                display(mass);
                break;
            }
            case 2: {
                selectionSort(mass);
                display(mass);
                break;
            }
            case 3: {
                arraysSort(mass);
                display(mass);
                break;
            }
            default: {
                System.out.println("Вы ввели неверное число");
            }
        }

        findEven(mass);

    }

//получаем значение с клавиатуры
    public static int getter(int value) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение (только целое число):");
        value = scanner.nextInt();
        return value;

    }

//метод для отображения
    public static void display(int[] mass) {
        System.out.println("Ваш массив");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(" \"Значение " + mass[i] + "\" |");

        }

    }

    //пузырьковый метод сортировки
    public static void bubbleSort(int[] mass) {
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }

    }

    //метод сортировки выбором
    public static void selectionSort(int[] mass) {
        for (int min = 0; min < mass.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < mass.length; j++) {
                if (mass[j] < mass[least]) {
                    least = j;
                }
            }
            int tmp = mass[min];
            mass[min] = mass[least];
            mass[least] = tmp;
        }
    }

    //метод сортировки из класса Arrays
    public static void arraysSort(int[] mass) {
        Arrays.sort(mass);
    }

//определяем все четные цифры массива и выводим на экран
    public static void findEven(int[] mass) {
        System.out.println("\nЧетные значения массива");
        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] % 2) == 0) {
                System.out.print(" \"Значение " + mass[i] + "\" |");
            }

        }

    }
}
