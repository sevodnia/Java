package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //номера авто
        //телефоны 
        //мэйлы

        String auto = "2231 PP-07";
        String tel = "+375 33 6489566";
        String mail = "cdscsdc sd@xx.by cscd cscdscs@@ dcsd@bn.com dcsd@bn.c dcsd@bn.comm";
        
        if (checkAuto(auto)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        if (checkTel(tel)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println(checkMail(mail));

    }

    public static boolean checkAuto(String auto) {
        Pattern p = Pattern.compile("^[0-9]{4}\\s[A-Z]{2}-0[1-7]$");
        Matcher m = p.matcher(auto);
        return m.matches();
    }

    public static boolean checkTel(String tel) {
        Pattern p = Pattern.compile("^\\+375\\s(33|29|44|25|17)\\s[1-9][0-9]{6}$");
        Matcher m = p.matcher(tel);
        return m.matches();
    }

    public static String checkMail(String auto) {
        Pattern a = Pattern.compile("[a-z]*@[a-z]*[.][a-z]{2,3}(\\s|$)");
        Matcher b = a.matcher(auto);
        String str = "!";
        return b.replaceAll(str);
    }
    
    

    
    
    
}
