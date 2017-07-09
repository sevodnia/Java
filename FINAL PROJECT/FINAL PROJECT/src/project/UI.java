package project;

//UI - здесь пользователь работает с программой
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UI extends Thread {

    private static UI instance;
    public static Root root;
    //обработка проверок введенных данных
    Checker checker = new Checker();
    static Parse obj;

    @Override
    public void run() {

        //obj = null;
        boolean flag = true;
        while (flag) {
            System.out.println("Введите \"1\", чтобы загрузить файл XML, введите \"2\","
                    + " чтобы загрузить файл JSON \nВведите ваш выбор:");
            Scanner scan = new Scanner(System.in);
            try {
                switch (scan.nextInt()) {
                    case 1:
                        //загружаем XML 
                        obj = new ParseXML();
                        flag = false;
                        break;
                    case 2:
                        //загружаем JSON  
                        obj = new ParseGson();
                        flag = false;
                        break;
                    default:
                        System.out.println("Вы ввели неверный символ, попробуйте ещё раз");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Вы ввели неверный символ, попробуйте ещё раз");

            }
        }

        //загружаем выбранный файл в новом потоке
        Load load = new Load();
        load.start();
        //прогрессбар для загрузки
        while (load.isAlive()) {
            System.out.print(".");
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("\n");
        //парсим файл
        root = obj.parseFile();

        //считаем успеваемость каждого студента
        Manager.countAverage(root.getStudents());

        System.out.println("\n\n===>СПИСОК ВСЕХ СТУДЕНТОВ<===");
        //выводим на печать все объекты класса root
        Manager.printStudent(root.getStudents());

        //блок цикла сортировки и поиска
        flag = true;
        do {
            System.out.println("\n===>ПОИСК И СОРТИРОВКА<===");
            System.out.println("Введите 1 - если вам нужен поиск");
            System.out.println("Введите 2 - если вам нужена сортировка");
            System.out.println("Введите 0 - если вы хотите завершить программу");
            Scanner scan = new Scanner(System.in);
            try {

                switch (scan.nextInt()) {
                    case 0:
                        flag = false;
                        return;
                    case 1:
                        System.out.println("Выберите вид поиска: 1 - по ФИО, 2 по дате рождения");

                        switch (scan.nextInt()) {
                            case 1:
                                //поиск по ФИО
                                System.out.println("\n\n===>ПОИСК ПО ФИО<===");
                                System.out.print("Фамилия или имя студента содержит (введите текст):");
                                //ввод ФИО и проверка 
                                String str = checker.checkName();
                                System.out.println("\n\n===>РЕЗУЛЬТАТ ПОИСКА<===");
                                Manager.findByName(root.getStudents(), str);

                                break;

                            case 2:
                                //Поиск по дате рождeния
                                System.out.print("\n\n===>ПОИСК ПО ДАТЕ РОЖДЕНИЯ<===\n"
                                        + "Введите дату рождения студента в формата yyyy-MM-dd:");
                                //ввод даты и проверка
                                String date = checker.checkDate();
                                System.out.println("\n\n===>РЕЗУЛЬТАТ ПОИСКА<===");
                                Manager.findByDate(root.getStudents(), Adapter.adaptor(date));
                                break;

                            default:
                                System.out.println("Вы ввели неверный символ, попробуйте ещё раз");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Выберите тип сортировки: 1 - по ФИО, 2 - по дате рождения, 3 - "
                                + "по успеваемости");
                        switch (scan.nextInt()) {

                            case 1:
                                //сортировка всех студентов по ФИО
                                System.out.println("\n\n===>СОРТИРОВКА ВСЕХ СТУДЕНТОВ ПО ФИО (A-Z)<===");
                                Manager.sortByName(root.getStudents());
                                break;

                            case 2:
                                //сортировка всех студентов по Дате рождения
                                System.out.println("\n\n===>СОРТИРОВКА ВСЕХ СТУДЕНТОВ ПО ДАТЕ РОЖДЕНИЯ (МОЛОДОЙ-СТАРЫЙ)<===");
                                Manager.sortByDate(root.getStudents());
                                break;

                            case 3:
                                //сортировка всех студентов по успеваемости
                                System.out.println("\n\n===>СОРТИРОВКА ВСЕХ СТУДЕНТОВ ПО УСПЕВАЕМОСТИ (ХОРОШО-ПЛОХО)<===");
                                Manager.sortByAverage(root.getStudents());

                                break;

                            default:
                                System.out.println("Вы ввели неверный символ, попробуйте ещё раз");
                                break;

                        }

                        break;

                    default:
                        System.out.println("Вы ввели неверный символ, попробуйте ещё раз");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Убедитесь, что вы ввели нужную цифру и повторите ещё раз");
            }

        } while (flag);

    }

    //паттерн SINGLETON - т.к. нам не нужно больше одного UI
    public static synchronized UI GetInstance() {
        if (instance == null) {
            instance = new UI();
        }
        return instance;
    }

    private UI() {
    }

    public static Parse getObj() {
        return obj;
    }

    public static void setObj(Parse obj) {
        UI.obj = obj;
    }

}
