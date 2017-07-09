package project;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ParseGson implements Parse {

    private static final String LINK = "http://kiparo.ru/t/student.json";
    private static final String STORE = "students.json";

    @Override
    public Root parseFile() {
        Root root = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(STORE));
            Gson gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            root = gsonBuilder.fromJson(reader, Root.class);
        } catch (JsonIOException e) {
            System.out.println("JsonIOException  - Ошибка парсинга GSON файла");
        } catch (JsonSyntaxException e) {
            System.out.println("JsonSyntaxException  - Ошибка парсинга GSON файла");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException - Ошибка парсинга GSON файла");
        }
        //System.out.println("Парсинг JSON прошел успешно");
        return root;

    }

    @Override
    public String getLink() {
        return LINK;
    }

    @Override
    public String getStore() {
        return STORE;
    }

}
