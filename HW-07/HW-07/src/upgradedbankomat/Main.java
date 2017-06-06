package upgradedbankomat;

import java.util.Scanner;

public class Main implements AddMoneyInterface, ShowMoneyInterface{

    public static void main(String[] args) {
        NewBankomat newBankomat = new NewBankomat(2, 2, 2);
        Main main=new Main();
        newBankomat.setAddmon(main);
        newBankomat.setShowmon(main);
        main.showMoney(newBankomat);
        main.addMoney(newBankomat);
        main.showMoney(newBankomat);
        Scanner scan = new Scanner(System.in);
        int sum;
        while (newBankomat.chpok) {
            System.out.println("===Введите сумму для снятия====");

            sum = scan.nextInt();
            newBankomat.getMoney(sum);
            main.showMoney(newBankomat);
        }
        System.out.println("НЕТ БАНКНОТ!");

    }

    @Override
    public NewBankomat addMoney(NewBankomat newBankomat){
            Scanner sc = new Scanner(System.in);
        System.out.println("====Загружаем деньги=====");
        System.out.println("Введите кол-во 20");
        newBankomat.setNumber20(sc.nextInt() + newBankomat.getNumber20());
        System.out.println("Введите кол-во 50");
        newBankomat.setNumber50(sc.nextInt() + newBankomat.getNumber50());
        System.out.println("Введите кол-во 100");
        newBankomat.setNumber100(sc.nextInt() + newBankomat.getNumber100());

        return newBankomat;
    
    
    
    }
    
    @Override
    public void showMoney(NewBankomat newBankomat){
            System.out.println("====В банкомате загружены деньги=====");
        System.out.print("Кол-во 20 - ");
        System.out.println(newBankomat.getNumber20());
        System.out.print("Кол-во 50 - ");
        System.out.println(newBankomat.getNumber50());
        System.out.print("Кол-во 100 - ");
        System.out.println(newBankomat.getNumber100());
    
    
    
    }
            
    
    
}
