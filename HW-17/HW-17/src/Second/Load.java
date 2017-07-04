package Second;

//Load.class - класс, который загружает выбранный объект из сети и сохраняет его по указанному адресу
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Load {

    protected static void load(Parse obj) {

        InputStream inputStream = null;
        FileOutputStream outPutStream = null;
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

            }
            else{
                System.out.println("Please, try late, cause the Internet prombles appeared");
            }

        } catch (Exception ex) {
            System.out.println("Ошибка соединения " + ex.toString());
        } finally {

            try {

                if (inputStream != null) {
                    inputStream.close();

                }
                if (outPutStream != null) {
                    outPutStream.close();
                }
            } catch (Exception e) {

                System.out.println("Ошибка при закрытии " + e.toString());
            }

        }
       // System.out.println("Загрузка файла прошла успешно");
    }

}
