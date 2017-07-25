package calcWithNoExeption;

import java.util.Scanner;


public class Main {



        public static void main(String[] args) {
            System.out.println("Welcom to our new calculator. We work with +,-,/,*");
            System.out.println("Imput your expression here without spaces, please. For Example 2*10");
            Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();
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
    }



