package jacksonParsing;

import java.util.ArrayList;

public class Test {

    private String name;

    ArrayList <People> people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Test{" + "name=" + name + ", people=" + people + '}';
    }

  

}
