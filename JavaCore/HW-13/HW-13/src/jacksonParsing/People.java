package jacksonParsing;

public class People {

    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean isDegree;

    @Override
    public String toString() {
        return "People{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", isDegree=" + isDegree + '}';
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsDegree() {
        return isDegree;
    }

    public void setIsDegree(boolean isDegree) {
        this.isDegree = isDegree;
    }

}
