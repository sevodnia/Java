package bankomat;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat(10, 7, 5);

//показываем сколько есть банкнот 
        bankomat.showMoney(bankomat);
// вызываем метод добавления денег в банкомат и обновляем кол-во банконот
        bankomat = addMoney(bankomat);
//показываем сколько есть банкнот в Банкомате
        bankomat.showMoney(bankomat);

//создаем новый объект сканнера        
        Scanner scan = new Scanner(System.in);

        int sum;

        //запускаем главный цикл
        boolean trigger = true;
        while (trigger) {

// определяем максимальную сумму к выдаче
            int max = bankomat.getNumber100() * 100 + bankomat.getNumber50() * 50 + bankomat.getNumber20() * 20;
            System.out.println("Максимальная сумма к выдачи: " + max);

//здесь просим ввести сумму
            System.out.println("Введите сумму которую вы хотите снять кратную 20");

            sum = scan.nextInt();
            scan.nextLine();

            if (sum <= max) {
                Random random = new Random();
                int a = 0;
                int b = 0;
                int c = 0;
                for (int i = 1; i > 0; i++) {
                    // System.out.println(a+""+b+""+c);
                    if ((sum - a * 20 - b * 50 - c * 100) == 0) {
                        System.out.println("======Возмите ваши деньги.======= \nКоличество купюр 20$ - "
                                + a + "\n" + "Количество купюр 50$- "
                                + b + "\n" + "Количество купюр 100$- " + c);
                        //отнимаем количество купюр от остатка из банкомата
                        bankomat.setNumber20(bankomat.getNumber20() - a);
                        bankomat.setNumber50(bankomat.getNumber50() - b);
                        bankomat.setNumber100(bankomat.getNumber100() - c);

                        break;
                    } else if ((bankomat.getNumber20() - a) < 0) {
                        bankomat.setIsComplete(false);
                        System.out.println("Операция не может быть выполнена. Ответ: A" + bankomat.getIsComplete());
                        break;

                    } else if ((bankomat.getNumber50() - b) < 0) {

                        bankomat.setIsComplete(false);
                        System.out.println("Операция не может быть выполнена. Ответ: B" + bankomat.getIsComplete());
                        break;

                    } else if ((bankomat.getNumber100() - c) < 0) {

                        bankomat.setIsComplete(false);
                        System.out.println("Операция не может быть выполнена. Ответ: C" + bankomat.getIsComplete());
                        break;

                    } else if (i == 10000000) {
                        //прерываем цикл когда подбирать значения не имеет смысла
                        bankomat.setIsComplete(false);
                        System.out.println("Операция не может быть выполнена. Ответ: D" + bankomat.getIsComplete());
                        break;

                    } else if (bankomat.getNumber20() == 0 && bankomat.getNumber50() == 0 && bankomat.getNumber100() == 0) {
                        trigger = false;
                        break;
                    } else {
                        a = random.nextInt(bankomat.getNumber20() + 1);
                        b = random.nextInt(bankomat.getNumber50() + 1);
                        c = random.nextInt(bankomat.getNumber100() + 1);
                    }

                }
            } else {
                bankomat.setIsComplete(false);
                System.out.println("Вы ввели неверную сумму. Ответ: " + bankomat.getIsComplete());
            }

            //показываем сколько есть банкнот в Банкомате
            bankomat.showMoney(bankomat);

        }

    }

    public static Bankomat addMoney(Bankomat bankomat) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Загружаем деньги в банкомат.======\n Введите количество купюр по 20$");
        bankomat.setNumber20(bankomat.getNumber20() + sc.nextInt());
        sc.nextLine();
        System.out.println("Введите количество купюр по 50$");
        bankomat.setNumber50(bankomat.getNumber50() + sc.nextInt());
        sc.nextLine();
        System.out.println("Введите количество купюр по 100$");
        bankomat.setNumber100(bankomat.getNumber100() + sc.nextInt());

        return bankomat;
    }

}
