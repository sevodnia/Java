package read;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkInFile {

    public  static String fileNameToRead = "C:\\Users\\Umbra\\Desktop\\java_dev\\HW-10\\read1.txt";

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //здесь мы читаем из файла
        Work work= new Work();
        work.work();


        
        
        

    }

}
