package bankomat;

public class Bankomat {
    //количество купюр разных номиналов.
    private int number20;
    private int number50;
    private int number100;

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    
      
    private  boolean isComplete;



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

    
    //метод выводит количество купюр в наличии
        public  void showMoney(Bankomat bankomat){
            System.out.println("====В банкомат загружены купюры:======\n"
                + "20$ - количество банкнот "+bankomat.getNumber20()+"\n"
                + "50$ - количество банкнот "+bankomat.getNumber50()+"\n"
                + "100$ - количество банкнот "+bankomat.getNumber100());
    
    
    
    
    
    }

    public Bankomat(int number20, int number50, int number100) {
        this.number20 = number20;
        this.number50 = number50;
        this.number100 = number100;
    }
    
    
    
}
