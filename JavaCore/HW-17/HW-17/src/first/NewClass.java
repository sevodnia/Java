package first;

public class NewClass {

    /*
    Домашнее задание с потоками
     */
    public static void main(String[] args) {
        Download download = new Download();
        Processing processing = new Processing();
        
        download.setProcessing(processing);
        processing.setDownload(download);
        download.start();
        processing.start();
    }

}
