package singleton;

import java.util.Date;

public class C {

    private static C instance;
    private static final Date DATE = new Date();
    private static Date newDate = new Date(DATE.getTime());
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private C() {
    }

    public static C returnC() {

        if (DATE.equals(newDate)) {
            if (instance == null) {
                instance = new C();
                newDate = new Date();
            }
        }
        return instance;
    }

}
