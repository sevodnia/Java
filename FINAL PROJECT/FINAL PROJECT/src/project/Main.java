package project;

public class Main {

    /*
    Главный класс - точка входа в программу
     */
    public static void main(String[] args) {
        //запускаем пользовательский интерфейс с SINGLETON
        UI user = UI.GetInstance();
        user.start();

    }

}
