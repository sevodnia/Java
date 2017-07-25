package regexThree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    MyException e = new MyException();

    public static void main(String[] args) {
        String str = "ghgf101.json";
        if (checkFormat(str)) {
            Pattern p = Pattern.compile("[A-Za-z0-9-_]*\\.(?=\\w{2,})");
            Matcher m = p.matcher(str);
            String finalResult = m.replaceAll("");
            System.out.println("File format is = " + finalResult);
        } else {
            System.exit(0);

        }

    }

    public static boolean checkFormat(String str) {
        boolean c = false;

        try {
            //  Pattern f = Pattern.compile("[A-Za-z0-8-_]*\\.((json)|(xml))");
            c = Pattern.matches("[A-Za-z0-9-_]*\\.((json)|(xml))", str);

            if (c) {

                return c;
            } else {
                throw new MyException();
            }

        } catch (MyException e) {
            System.out.println(e.getWarning());
        }
        return c;
    }

}
