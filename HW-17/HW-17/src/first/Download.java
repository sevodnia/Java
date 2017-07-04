package first;




public class Download extends Thread {

    Processing processing;

    public void setProcessing(Processing processing) {
        this.processing = processing;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("START DOWNLOADING");

        }

        synchronized (processing) {
            processing.notifyAll();
            //будим другие потоки

        }

        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
            }

            for (int i = 0; i < 10; i++) {
                System.out.println("START DOWNLOADING");

            }

            synchronized (processing) {
                processing.notifyAll();
                //будим другие потоки

            }

        }
    }

}
