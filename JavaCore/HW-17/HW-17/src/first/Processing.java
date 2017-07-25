package first;


public class Processing extends Thread {

    Download download;

    public void setDownload(Download download) {
        this.download = download;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("PROCESSING");

        }

        synchronized (download) {
            download.notifyAll();

        }

        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("PROCESSING");

        }
        System.out.println("MISSION COMPLETED");
    }

}
