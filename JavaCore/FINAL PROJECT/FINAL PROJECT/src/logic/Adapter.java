package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Шаблон проектирования "Адаптер". Послучаем в параметры метода строку и
 * конвертируем её в тип дата
 */
public class Adapter {
    /*
    единственный метод для конвертации из string -> date
    Сделаем его статическим, чтобы он был доступен из любой точки программы.
    */
    
    private String str;

    public Adapter(String str) {
        this.str = str;
    }
    
            
    public   Date adaptor() {
        SimpleDateFormat tmp = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDate = new Date();
        try {
            inputDate = tmp.parse(str);
        } catch (ParseException ex) {
            System.out.println("Ошибка парсинга даты");
        }

        return inputDate;
    }

}
