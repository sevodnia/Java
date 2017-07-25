package read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Work {

    public void work() throws IOException {
//создаем новый объект класса FILE 
        File file = new File(WorkInFile.fileNameToRead);
//проверяем, существует ли вообще данный файл.
        try {
            file.exists();
        } catch (Exception e) {
            System.out.println("Указанного файла не существует!");
        }

        Student student = new Student();
//создаем объект класса BufferedReader
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            try {
                String str;
                while ((str = in.readLine()) != null) {
                    String[] strArray = str.split("\\|");
                        student.name=strArray[0];
                        student.age= Integer.valueOf(strArray[1]);
                        student.isStudent = Boolean.valueOf(strArray[2]);
                                System.out.println(student.toString());
                }
            } catch (IOException ex) {

            }
        finally {
                in.close();
            }
        } catch (FileNotFoundException ex) {

        }


    }

    
    
    
}
