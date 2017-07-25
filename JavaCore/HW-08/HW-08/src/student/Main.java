package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество студентов  ");
        int all = scan.nextInt();
        scan.nextLine();
        Student mass[] = new Student[all];
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        for (int i = 0; i < mass.length; i++) {

            System.out.println("Введите имя студента");
            mass[i] = new Student();
            mass[i].setName(scan.nextLine());

            System.out.println("Введите фамилию студента");
            mass[i].setSurName(scan.nextLine());

            System.out.println("Введите дату рождения студента в формате dd.MM.yyyy");
            try {
                mass[i].dateOfBirth = sdf.parse(scan.nextLine());
            } catch (ParseException ex) {
                System.out.println("Неопознанная ошибка");
            }
            System.out.println("=>Дата рождения студента: " + sdf.format(mass[i].dateOfBirth));

        }
//Вычисляем средний возраст студента,
// студент с большой долей вероятности будет рожден позже, чем 1970 год.

        Date upToDate = new Date();
        long sum = 0L;

        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i].dateOfBirth.getTime();

        }
        sum = sum / mass.length;

        //пробуем через григорианский календарь
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(upToDate.getTime() - sum);

        System.out.print("Средний возраст всех студентов: ");
        System.out.print((calendar.get(Calendar.YEAR) - 1970) + " лет ");
        System.out.print(calendar.get(Calendar.MONTH) + " месяцев ");
        System.out.print( calendar.get(Calendar.DAY_OF_MONTH)+" дней ");
        System.out.print(calendar.get(Calendar.HOUR)+" часов ");
        System.out.println(calendar.get(Calendar.MINUTE)+" минут");
    }

}
