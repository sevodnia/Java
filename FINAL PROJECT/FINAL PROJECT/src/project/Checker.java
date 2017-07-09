package project;

import java.util.Scanner;

/**
 * Класс, который проверяет исходные данные полученные от сканнера
 */
public class Checker {

    Scanner sc = new Scanner(System.in);

    public String checkName() {
        boolean flag = true;
        String str;

        do {
            str = sc.nextLine();
            //здесь нужно приписать различные проверки с помощью regex
            if (str.matches("\\s*[A-Za-z]+\\s*")) {
                str = str.replaceAll("^\\s+|\\s+$", "");
                flag = false;
            } else if (str.matches("\\s*[A-Za-z]+\\s[A-Za-z]+\\s*")) {
                str = str.replaceAll("^\\s+|\\s+$", "");
                flag = false;
            } else {
                System.out.println("Вы ввели неверный текст для поиска, попробуйте ещё раз");
                System.out.print("Фамилия или имя студента содержит:");
            }
        } while (flag);

        return str;
    }

    public String checkDate() {
        String str;
        boolean flag = true;
        do {
            str = sc.nextLine();
            if (str.matches("\\s*\\d{4}[-]\\d{2}[-]\\d{2}\\s*")) {
                str = str.replaceAll("^\\s+|\\s+$", "");
                flag = false;
            } else {
                System.out.println("Вы ввели неверную дату для поиска, попробуйте ещё раз");
                System.out.print("Введите дату рождения студента в формата yyyy-MM-dd:");
            }
        } while (flag);
        return str;
    }

}
