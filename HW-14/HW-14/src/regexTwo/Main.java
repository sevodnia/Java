package regexTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "hellowoooorld hoo bgbgbgffb dscdscdscsrrttrrtrt";
        char[] array = str.toCharArray();
        char c = '\u0000';
        //mult - счетчик для кол-ва повторений
        int mult = 1;
        //b - внутенний счетчик для внутреннего цикла 
        int b;
        StringBuilder result = new StringBuilder();
        //считаем количество повторений
        for (int i = 0; i < array.length; i++) {

            if (c == (array[i])) {
                mult += 1;
                b = i + 1;
                for (int a = b; a < array.length; a++) {

                    if (c == array[a]) {
                        mult += 1;
                    } else {
                        break;
                    }
                }
                result.append(mult);
                mult = 1;
                continue;
            } else {
                result.append(array[i]);
                c = array[i];

            }

        }
        System.out.println("Start is = " + str);
        //удалаем все ненужные числа с помощью регулярных выражений
        Pattern p = Pattern.compile("(?<=\\d{1})\\d*");
        Matcher m = p.matcher(result);
        String finalResult = m.replaceAll("");
        System.out.println("FinalResult is = " + finalResult);

    }

}
