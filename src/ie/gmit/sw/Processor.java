package ie.gmit.sw;

import java.io.File;

public class Processor implements Runnable {
    private int id;
    public Processor(int id){
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Starting thread: " +id);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed Thread: " +id);
    }
}


