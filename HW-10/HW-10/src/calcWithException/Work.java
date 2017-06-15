package calcWithException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work {

    public String string;

    public void work() throws MyException {
        System.out.println("Welcom to our new calculator. We work with +,-,/,*");
        System.out.println("Imput your expression here without spaces, please. For Example 2*10");

        Scanner scan = new Scanner(System.in);
        string = scan.nextLine();

        try {

            ex(string);

        } catch (MyException ex) {
            MyException myException = new MyException(5);
            myException.getRussianMessage();
            System.out.println("The error has occurred");
            System.exit(0);
        }

        String[] parts = string.split("\\D");
        double part1 = Double.parseDouble(parts[0]);
        double part2 = Double.parseDouble(parts[1]);

        Calc calculator = new Calc();

        if (string.contains("-")) {
            // если вычитание
            calculator.subtraction(part1, part2);
        } else if (string.contains("+")) {

            //если сложение
            calculator.addition(part1, part2);
        } else if (string.contains("/")) {
            //если деление
            calculator.division(part1, part2);
        } else {
            //если умножение
            calculator.multiplication(part1, part2);
        }

        System.out.println("Result = " + calculator.getResult());
    }

    public void ex(String string) throws MyException {
        //проверяем строку с помощью регулярного выражения
        Pattern p = Pattern.compile("\\d[/+*-]\\d$");
        Matcher m = p.matcher(string);

        if (!m.matches()) {

            throw new MyException(5);
        }

    }

}
