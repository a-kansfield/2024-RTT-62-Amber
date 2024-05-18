package misc.college;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class StudentEnroll {
    public static void main(String[] args){
        File file = new File("src/main/java/misc/college/files/IDs.csv");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            IDGen idGen = new IDGen(file,
                    new Scanner(file),
                    new FileWriter(file, true));

            Student student = new Student(idGen.generateID(), 29, 3.8, "Amber Kansfield", "Computer Science");
            System.out.println(student);

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
