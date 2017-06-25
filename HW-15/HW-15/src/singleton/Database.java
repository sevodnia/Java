package singleton;

public class Database {
/*
    Var.No1
    Вариант  ленивой инициализации, т.к когда объект создается НЕ непосредственно
    при вызове метода.
    */
    
    private static Database database = new Database();

    private Database() {
    }

    public static Database getInstace() {

        return database;
    }

}
