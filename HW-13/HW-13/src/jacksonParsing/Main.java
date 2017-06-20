package jacksonParsing;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path = "src\\jacksonParsing\\test.json";
        File file = new File(path);
        //  parsing(file);
        newParsing(file);
    }

    public static void newParsing(File file) {
        ObjectMapper mapper = new ObjectMapper();
        Test test = null;
        try {
            test = mapper.readValue(file, Test.class);
        } catch (Exception e) {
            System.out.println("Something goes wrong " + e.getMessage());
        }
        System.out.println(test.toString());

        System.out.println(test.getName());
        for (int i = 0; i < test.people.size(); i++) {

            System.out.println(test.people.get(i));
        }

    }

}
