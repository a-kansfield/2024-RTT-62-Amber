package slides._303_13;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        // .. means go up one directory from where you are
        // . means the current directory from where I am right now.

        File f = new File(".");

        File[] files = f.listFiles();
        for( File file : files) {
            System.out.print("    " + file.getAbsolutePath());
            if ( file.isDirectory()) {
                System.out.println(" is a directory");
            } else {
                System.out.println(" is a file");
            }
        }



        File file = new File(".\\newfile.txt");
        file.createNewFile();






//        File code = new File("C:\\Users\\akans\\development\\2024-RTT-62\\java_classwork\\JavaClasswork\\src\\main\\java\\slides\\_303_13\\FileExample.java"); // Path to this class
//
//        File relative = new File("..\\..\\New Folder\\newfile.txt"); // Does not work, incorrect directory
//        System.out.println(relative.exists());
    }
}
