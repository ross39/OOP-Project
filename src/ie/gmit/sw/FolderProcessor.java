package ie.gmit.sw;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;

public class FolderProcessor {
    private static final Logger log = Logger.getGlobal();
    private final ExecutorService pool;

    public FolderProcessor(ExecutorService pool){
        this.pool = pool;
    }

    void processFolder(String inputPath, String outputPath){
        File inputFolder = new File(inputPath);
        for (String filename : inputFolder.list()) {
            String filePath = inputFolder.toPath().resolve(filename).toString();
            String writeTo = new File(outputPath).toPath().resolve(filename).toString();
            if (new File(filePath).isDirectory()) {
                pool.execute(() -> processFolder(filePath, writeTo));
            } else {
                pool.execute(() -> {
                    log.info("Start processing " + filePath);
                });
            }
        }
    }
}
