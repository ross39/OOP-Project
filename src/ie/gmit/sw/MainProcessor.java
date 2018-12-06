package ie.gmit.sw;

import java.io.File;

//This class is used to process the files within the folder
public class MainProcessor implements Runnable {
    final File fileToProcess;
    public MainProcessor(File file){
       fileToProcess = file;
    }
    @Override
    public void run() {
        
    }
}




