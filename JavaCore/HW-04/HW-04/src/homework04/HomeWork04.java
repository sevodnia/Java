package homework04;

import java.util.Scanner;

public class HomeWork04 {

    int number;

    public static void main(String[] args) {

//подключаем сканнер, определяем кол-во пациентов, определяем название больницы
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество пациентов больницы");
        int number = scan.nextInt();

        //костыль для корректной работы сканера
        scan.nextLine();
        System.out.println("Введите название больницы:");
                
        Pacient.hospitalName = scan.nextLine();

        //создаем массив объектов класса Pacient
        Pacient[] arrayOfPacients = new Pacient[number];
//записываем данные в массив arrayOfPacients с помощью цикла
        for (int i = 0; i < number; i++) {
            arrayOfPacients[i] = new Pacient();

            System.out.println("Введите данные пациента №" + (i + 1));

            System.out.println("Введите имя пациента:");
            arrayOfPacients[i].name = scan.nextLine();
            System.out.println("Введите фамилию пациента:");
            arrayOfPacients[i].surname = scan.nextLine();
            System.out.println("Введите возраст пациента:");
            arrayOfPacients[i].age = scan.nextInt();
            scan.nextLine();

            System.out.println("Введите диагноз пациента:");
            arrayOfPacients[i].diagnosis = scan.nextLine();

            System.out.println("Выживет ли в нашей больнице пациент? TRUE OR FALSE");
            arrayOfPacients[i].willSurvive = scan.nextBoolean();
            scan.nextLine();
        }
        //выводим на экран массив с пациентами
        Pacient.showList(arrayOfPacients);

        //спрашиваем пользователя по какому параметру искать?
        System.out.println("");
        System.out.println("Выбрите вариант: найти пациента из списка по возрасту "
                + "(Введите цифру 0) либо по ФАМИЛИИ (Введите цифру 1)");

        int choice;
        System.out.println("Введите ваш ответ: ");
        choice = scan.nextInt();
        //костыль для сканнера
        scan.nextLine();

        if (choice == 0) {
            //выводим пациентов по возрасту
            System.out.println("Введите возраст для поиска: ");
            int searchAge;
            searchAge = scan.nextInt();
            System.out.println("Результат поиска");
            for (int i = 0; i < arrayOfPacients.length; i++) {
                if (arrayOfPacients[i].age == searchAge) {

                    Pacient.showResult(arrayOfPacients, i);

                }
                                else{
                
                    System.out.println("Видимо такой пациент уже скончался :-)");
                }
                
                

            }

        } else if (choice == 1) {
            //выводим пациентов по фамилии
            System.out.println("Введите фамилию для поиска: ");
            String searchSurname;
            searchSurname = scan.nextLine();
            System.out.println("Результат поиска");
            for (int i = 0; i < arrayOfPacients.length; i++) {
                if (arrayOfPacients[i].surname.equals(searchSurname)) {

                    Pacient.showResult(arrayOfPacients, i);

                }
                else{
                
                    System.out.println("Видимо такой пациент уже скончался :-)");
                }

            }

        } else {
            System.out.println("Вы ввели неверное число");

        }

    }

}
