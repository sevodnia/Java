package student;

import java.util.ArrayList;

public class Root {

    /*
    Класс-обертка для все студентов, которые приходят с json & xml
     */
    private String name;
    private String location;

    private ArrayList<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


}
