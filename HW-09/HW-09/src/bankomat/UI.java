package bankomat;

import java.util.Scanner;

public class UI {

    private bankomat.OnBankomatListener listener = new OnBankomatListener() {

        @Override
        public void showProgressBar() {
            System.out.println("LISTENER!!! Здесь бежит белка в колесе...");
        }

        @Override
        public void operationComplited(NewBankomat newBankomat) {
            if (newBankomat.isCheck()) {
                System.out.println("LISTENER!!! Операция завершена успешно");
            } else {

                System.out.println("LISTENER!!! Операция не может быть выполнена");
            }

        }

    };

    public void startUI() {

        NewBankomat newBankomat = new NewBankomat(2, 2, 2);
        newBankomat.setListener(listener);
        Scanner scan = new Scanner(System.in);
        int sum;
        newBankomat.addMoney();
        while (newBankomat.chpok) {

            newBankomat.showMoney();
            System.out.println("===Введите сумму для снятия====");

            sum = scan.nextInt();
            newBankomat.getMoney(sum);

        }

        System.out.println("В банкомате закончились банкноты!");

    }

}
