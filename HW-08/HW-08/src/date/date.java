package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("MMMMMM dd"+"е, "+"h:mm a");
        
        System.out.println(sdf.format(date));
        
    }

}
