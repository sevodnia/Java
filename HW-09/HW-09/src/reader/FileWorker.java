package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWorker {

    public static void write(String fileName, String text) {
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();

            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print(text);

            } finally {

                out.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }

    public static String read(String fileNameToRead) throws FileNotFoundException {
        StringBuilder strBuild = new StringBuilder();
        File file = new File(fileNameToRead);
         exists(fileNameToRead);
        
         
        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    strBuild.append(s);
                    strBuild.append("\n");

                }

            } finally {
                in.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        return strBuild.toString();

    }
      public static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());

        }
    }

}
