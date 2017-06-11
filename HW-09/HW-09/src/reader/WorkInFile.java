package reader;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkInFile {

    private static String fileNameToWrite = "C:\\Users\\Umbra\\Desktop\\java_dev\\HW-09\\write.txt";
    private static String fileNameToRead = "C:\\Users\\Umbra\\Desktop\\java_dev\\HW-09\\read.txt";

    public static void main(String[] args) throws FileNotFoundException {

        //здесь мы читаем из файла
        System.out.println(FileWorker.read(fileNameToRead));

//здесь мы записываем в файл
        System.out.println("Введите текст для записи в файл: ");
        Scanner scan = new Scanner(System.in);
        FileWorker.write(fileNameToWrite, scan.nextLine());
        System.out.println("Данные в файл записаны");

    }

}
