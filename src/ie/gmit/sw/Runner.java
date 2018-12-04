package ie.gmit.sw;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    public static void main(String[] args){
        //variable declarations
        String subjectDirectory;
        String userQuery;
        Processor p;

        //Scanner declerations
        //Scanner in =new Scanner(System.in);
        //System.out.println("**DOCUMENT COMPARISON SERVICE");
        //System.out.println("*****************************");
        //System.out.println("Enter in the subject directory: \n");
        //subjectDirectory = in.next();
        //System.out.println("Enter the query file or URL");
        //userQuery = in.next();


        //This is the code to submit the subjectDirectory and userQuery to the threadpool in the Processor class
        ExecutorService executor = Executors.newFixedThreadPool(700);
        for(int i = 0; i < 10000000; i++){
            executor.submit(new Processor(i));
        }

        executor.shutdown();


    }


}
