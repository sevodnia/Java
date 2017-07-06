
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        Student student = new Student();
        Class studentClass = student.getClass();
        System.out.println(studentClass.getSimpleName());
//заполняем поля
        Field[] f = studentClass.getDeclaredFields();
        for (Field s : f) {
            System.out.println(s.toString());
            s.setAccessible(true);
            if (s.getName().equals("name")) {
                try {
                    s.set(student, "Jhoan");
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (s.getName().equals("age")) {

                try {
                    s.set(student, 12);
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (s.getName().equals("average")) {

                try {
                    s.set(student, 8.3f);
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        System.out.println(student.toString());

//вызов private метода
        System.out.println("PRIVATE METHODS");
        Method meth[] = studentClass.getDeclaredMethods();
        for (Method m : meth) {
            System.out.println(m.toString());
        }

        try {
            Method method = studentClass.getDeclaredMethod("printSomething");
            method.setAccessible(true);
            try {
                method.invoke(student);
            } catch (IllegalAccessException | InvocationTargetException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
