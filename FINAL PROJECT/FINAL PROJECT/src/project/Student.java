package project;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Student {

    /*
    Класс Student - описывает абстрактного студента
     */
    private int id;
    private String name;
    private String degree;
    private Date dateOfBirth;
    private ArrayList<Integer> rating = new ArrayList<>();
    private boolean visible;
    //поле для записи средней оценки
    private double average;

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;

    }

    public ArrayList<Integer> getRating() {
        return rating;
    }

    public void setRating(ArrayList<Integer> rating) {
        this.rating = rating;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void print() {
        //метод для "красивой" распечатки объекта студента
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.printf("%-3s%-20s%-8s%-15s%-50s%-10s%-10s%n", getId(),getName(),
        getDegree(),sdf.format(getDateOfBirth()),getRating().toString(),getAverage(),isVisible());

        
        
      
    }

    //компоратор для сортировки по ФИО 
    public static Comparator<Student> StudentNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            String studentName1 = student1.getName().toUpperCase();
            String studentName2 = student2.getName().toUpperCase();

            return studentName1.compareTo(studentName2);//по возрастанию
            //return studentName2.compareTo(studentName1);//по убыванию
        }

    };

    //компоратор для сортировки по дате рождения 
    public static Comparator<Student> StudentDateComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            Date studentDate1 = student1.getDateOfBirth();
            Date studentDate2 = student2.getDateOfBirth();

            //return studentDate1.compareTo(studentDate2);//по возрастанию
            return studentDate2.compareTo(studentDate1);//по убыванию
        }

    };

    //компоратор для сортировки по успеваемости 
    public static Comparator<Student> StudentAverageComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            Double studentAverage1 = student1.getAverage();
            Double studentAverage2 = student2.getAverage();

            //return studentDate1.compareTo(studentDate2);//по возрастанию
            return studentAverage2.compareTo(studentAverage1);//по убыванию
        }

    };

}
