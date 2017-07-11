package logic;

import student.Student;
import java.util.Collections;
import java.util.Date;
import student.Root;

/*вся логика приложения - вывод на экран, сортировка, поиск и т.д.*/
public class Manager {

    public Root root = new Root();
    private static Manager instance;

    private Manager() {
    }

    //метод для распечатки студентов в консоль
    public void printStudent() {
        printFirstRow();
        for (int i = 0; i < root.getStudents().size(); i++) {
            root.getStudents().get(i).print();
        }

    }

    //здесь мы считаем среднюю оценку
    public void countAverage() {
        for (int i = 0; i < root.getStudents().size(); i++) {
            Double sum = 0.0;
            for (int a = 0; a < root.getStudents().get(i).getRating().size(); a++) {
                sum += root.getStudents().get(i).getRating().get(a);
            }
            sum = sum / root.getStudents().get(i).getRating().size();
            root.getStudents().get(i).setAverage(sum);
        }
    }

//поиск по ФИО
    public void findByName(String str) {
        printFirstRow();
        boolean isFound = false;
        for (Student s : root.getStudents()) {
            //нам нужна проверка - если пользователь ввел текст в другом регистре
            if (s.getName().toUpperCase().contains(str.toUpperCase())) {
                s.print();
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("К сожалению, ничего не найдено");
        }
    }

//поиск по дате рождения
    public void findByDate(Adapter a) {
        printFirstRow();
        Date inputDate = a.adaptor();
        boolean isFound = false;
        for (Student s : root.getStudents()) {
            if (s.getDateOfBirth().equals(inputDate)) {
                s.print();
                isFound = true;
            }

        }
        if (!isFound) {
            System.out.println("К сожалению, ничего не найдено");
        }
    }

    //сортировка по ФИО
    public void sortByName() {
        printFirstRow();
        Collections.sort(root.getStudents(), Student.StudentNameComparator);
        for (Student s : root.getStudents()) {
            s.print();
        }
    }

//сортировка по дате рождения 
    public void sortByDate() {
        printFirstRow();
        Collections.sort(root.getStudents(), Student.StudentDateComparator);
        for (Student s : root.getStudents()) {
            s.print();
        }
    }

//сортировка по дате средней оценке (Успеваемости)
    public void sortByAverage() {
        printFirstRow();
        Collections.sort(root.getStudents(), Student.StudentAverageComparator);
        for (Student s : root.getStudents()) {
            s.print();
        }
    }

    //печать первого ряда таблицы
    public static void printFirstRow() {
        System.out.printf("%-3s%-20s%-8s%-15s%-50s%-10s%-10s%n", "ID", "Name", "Degree", "Date", "Rating", "Average", "Visible");
    }

    //паттерн SINGLETON - т.к. нам не нужно больше одного Manager
    public static synchronized Manager GetInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

}
