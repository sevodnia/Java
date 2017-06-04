package upgradedbankomat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NewBankomat newBankomat = new NewBankomat(2, 2, 2);

        newBankomat.showMoney(newBankomat);
        newBankomat.addMoney(newBankomat);
        newBankomat.showMoney(newBankomat);
        Scanner scan = new Scanner(System.in);
        int sum;
        while (newBankomat.chpok) {
            System.out.println("===Введите сумму для снятия====");

            sum = scan.nextInt();
            newBankomat.getMoney(sum);
            newBankomat.showMoney(newBankomat);
        }
        System.out.println("НЕТ БАНКНОТ!");

    }

}
