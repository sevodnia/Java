package download;

/**
 * Load.class - класс, который загружает выбранный объект из сети и сохраняет
 * его по указанному адресу
 *
 */
import parse.Parse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import UI.UI;

public class Load extends Thread {

    @Override
    public void run() {
        Parse obj = UI.getObj();
        InputStream inputStream = null;
        FileOutputStream outPutStream = null;

        Scanner scan = new Scanner(System.in);
        boolean flag;
        String inputInt = "";

        do {
            System.out.println("Загрузить файл? 1 - да, 2 - выход из программы. Введите ваш ответ");

            //проверяем введенный символ
            flag = false;
            while (!flag) {
                inputInt = scan.nextLine();
                if (inputInt.matches("\\s*\\d\\s*")) {
                    inputInt = inputInt.replaceAll("^\\s+|\\s+$", "");
                    flag = true;
                } else {
                    System.out.println("Вы ввели неверный символ");
                }
            }

            //парсим введенные символы и скачиваем файлы
            switch ((Integer.parseInt(inputInt))) {
                case 1:
                    try {
                        //открываем соединение
                        URL url = new URL(obj.getLink());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                        //получаем код ответ успешно или не успешно
                        int responseCode = httpURLConnection.getResponseCode();
                        //проверяем успешно ли подключение
                        if (responseCode == HttpURLConnection.HTTP_OK) {
                            inputStream = httpURLConnection.getInputStream();
                            File file = new File(obj.getStore());
                            outPutStream = new FileOutputStream(file);
                            int bytesRead = -1; //-1 если закончась инфа
                            byte[] buffer = new byte[1024]; // то что мы скачиваем т.е. полезная информация
                            while ((bytesRead = inputStream.read(buffer)) != -1) {
                                //зписываем в файл от 0 до bytesRead из массива buffer
                                outPutStream.write(buffer, 0, bytesRead);

                            }
                            flag = false;
                        } else {
                            System.out.println("Попрбуйте позже, т.к. произошла ошибка подключения. Код 0");

                        }

                    } catch (Exception ex) {
                        System.out.println("Ошибка соединения. Код 1 " + ex.toString());

                    } finally {

                        try {

                            if (inputStream != null) {
                                inputStream.close();

                            }
                            if (outPutStream != null) {
                                outPutStream.close();
                            }
                        } catch (Exception e) {

                            System.out.println("Ошибка при закрытии , Код 3" + e.toString());
                        }

                    }

                    break;

                case 2:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Вы ввели неверную цифру");
            }

        } while (flag);

    }

}
