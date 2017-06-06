package upgradedbankomat;

import java.util.Scanner;

public class NewBankomat {

    private int number20;
    private int number50;
    private int number100;

    private int give20 = 0;
    private int give50 = 0;
    private int give100 = 0;

    private boolean trigger;
    public boolean chpok = true;

    public NewBankomat(int number20, int number50, int number100) {
        this.number20 = number20;
        this.number50 = number50;
        this.number100 = number100;
    }

    public int getNumber20() {
        return number20;
    }

    public void setNumber20(int number20) {
        this.number20 = number20;
    }

    public int getNumber50() {
        return number50;
    }

    public void setNumber50(int number50) {
        this.number50 = number50;
    }

    public int getNumber100() {
        return number100;
    }

    public void setNumber100(int number100) {
        this.number100 = number100;
    }

    public NewBankomat addMoney(NewBankomat newBankomat) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Загружаем деньги=====");
        System.out.println("Введите кол-во 20");
        newBankomat.setNumber20(sc.nextInt() + getNumber20());
        System.out.println("Введите кол-во 50");
        newBankomat.setNumber50(sc.nextInt() + getNumber50());
        System.out.println("Введите кол-во 100");
        newBankomat.setNumber100(sc.nextInt() + getNumber100());

        return newBankomat;
    }

    public void showMoney(NewBankomat newBankomat) {
        System.out.println("====В банкомате загружены деньги=====");
        System.out.print("Кол-во 20 - ");
        System.out.println(getNumber20());
        System.out.print("Кол-во 50 - ");
        System.out.println(getNumber50());
        System.out.print("Кол-во 100 - ");
        System.out.println(getNumber100());

    }

    public void getMoney(int sum) {
        trigger = true;
        while (trigger) {

            if (sum > 0) {
                if (sum >= 100) {

                    if (getNumber100() >= 1) {
                        give100 = give100 + 1;
                        setNumber100(getNumber100() - 1);
                        sum = sum - 100;

                    } else {
                        if (getNumber50() >= 1) {
                            give50 = give50 + 1;
                            setNumber50(getNumber50() - 1);
                            sum = sum - 50;

                        } else {

                            if (getNumber20() >= 1) {
                                give20 = give20 + 1;
                                setNumber20(getNumber20() - 1);
                                sum = sum - 20;
                            } else {
                                System.out.println("Не можем выдать указанную сумму");
                                trigger = false;
                                give20 = 0;
                                give50 = 0;
                                give100 = 0;

                            }

                        }
                    }

                } else {

                    if (sum >= 50) {

                        if (sum == 60 || sum == 80) {

                            if (getNumber20() >= 1) {
                                give20 = give20 + 1;
                                setNumber20(getNumber20() - 1);
                                sum = sum - 20;

                            } else {

                                System.out.println("Не можем выдать указанную сумму");
                                trigger = false;
                                give20 = 0;
                                give50 = 0;
                                give100 = 0;

                            }

                        } else {

                            if (getNumber50() >= 1) {
                                give50 = give50 + 1;
                                setNumber50(getNumber50() - 1);
                                sum = sum - 50;

                            } else {

                                System.out.println("Не можем выдать указанную сумму");
                                trigger = false;
                                give20 = 0;
                                give50 = 0;
                                give100 = 0;
                            }

                        }

                    } else {

                        if (getNumber20() >= 1) {
                            give20 = give20 + 1;
                            setNumber20(getNumber20() - 1);
                            sum = sum - 20;

                        } else {

                            System.out.println("Не можем выдать указанную сумму");
                            trigger = false;
                            give20 = 0;
                            give50 = 0;
                            give100 = 0;

                        }

                    }

                }

            } else if (sum == 0) {
                trigger = false;
                System.out.println("=====Возмите ваши деньги====");
                System.out.println("100$ -- " + give100);
                System.out.println("50$ -- " + give50);
                System.out.println("20$ -- " + give20);
                give20 = 0;
                give50 = 0;
                give100 = 0;
            } else {
                trigger = false;
                System.out.println("Выдать деньги не сможем");
                give20 = 0;
                give50 = 0;
                give100 = 0;

            }

        }

        if (getNumber100() == 0 && getNumber50() == 0 && getNumber20() == 0) {
            chpok = false;
        }

    }

}
