package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/*вся логика приложения - вывод на экран, сортировка, поиск и т.д.*/
public class Manager {

    //метод для распечатки студентов в консоль
    public static void printStudent(ArrayList<Student> students) {
        printFirstRow();
        for (int i = 0; i < students.size(); i++) {
            students.get(i).print();
        }

    }

    //здесь мы считаем среднюю оценку
    public static void countAverage(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Double sum = 0.0;
            for (int a = 0; a < students.get(i).getRating().size(); a++) {
                sum += students.get(i).getRating().get(a);
            }
            sum = sum / students.get(i).getRating().size();
            students.get(i).setAverage(sum);
        }
    }

//поиск по ФИО
    public static void findByName(ArrayList<Student> students, String str) {
        printFirstRow();
        boolean isFound = false;
        for (Student s : students) {
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
    public static void findByDate(ArrayList<Student> students, Date inputDate) {
        printFirstRow();
        boolean isFound = false;
        for (Student s : students) {
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
    public static void sortByName(ArrayList<Student> students) {
        printFirstRow();
        Collections.sort(students, Student.StudentNameComparator);
        for (Student s : students) {
            s.print();
        }
    }

//сортировка по дате рождения 
    public static void sortByDate(ArrayList<Student> students) {
        printFirstRow();
        Collections.sort(students, Student.StudentDateComparator);
        for (Student s : students) {
            s.print();
        }
    }

//сортировка по дате средней оценке (Успеваемости)
    public static void sortByAverage(ArrayList<Student> students) {
        printFirstRow();
        Collections.sort(students, Student.StudentAverageComparator);
        for (Student s : students) {
            s.print();
        }
    }

    //печать первого ряда таблицы
    public static void printFirstRow() {
        System.out.printf("%-3s%-20s%-8s%-15s%-50s%-10s%-10s%n", "ID", "Name", "Degree", "Date", "Rating", "Average", "Visible");
    }

    
    //специальный вывод средней оценки студентов
/*
    public static void printAverage(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Фамилия, имя = " + students.get(i).getName() + ", "
                    + "Средняя оценка = " + students.get(i).getAverage());

        }

    }
     */    
    
    
    
    
    
    
}
