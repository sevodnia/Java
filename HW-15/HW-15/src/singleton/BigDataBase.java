package singleton;

public class BigDataBase {
/*
    Var.No2
    реализация через вложенный класс
    */
    private BigDataBase() {

    }

    private static class BigDataBaseHolder {

        private final static BigDataBase bigDataBase = new BigDataBase();

    }
public static BigDataBase getBigDataBase(){

return BigDataBaseHolder.bigDataBase;

}
    
    
    
}
