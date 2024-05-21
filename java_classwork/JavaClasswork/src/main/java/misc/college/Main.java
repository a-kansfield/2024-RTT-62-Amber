package misc.college;   //region Packages
                        //  Used to group related files.
                        //  Basically a folder but with added functionality.
                        //  Allows code to be separated.
                        //  If a Java file is within a package, it needs to be declared like it is here.
                        //  endregion

//region Imports
//  You can include functionality from other packages,
//  classes or interfaces through the import feature.
//  Note, you can use the .* extension to import everything from a particular package.
//  For example, you could include everything in java.io by typing java.io.*
//endregion
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/misc/college/files/IDs.csv");
        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("ID,Name,Age,Major,GPA");
                writer.close();
            }

            IDGen idGen = new IDGen(file,
                            new Scanner(file).useDelimiter(","));

            StudentEnroll se    = new StudentEnroll();
            Student student     = new Student(idGen.generateID(),
                                        3.8,
                                        se.requestName(),
                                        se.requestMajor(),
                                        se.requestAge());

            se.saveEntry(student, file);
            System.out.println(student);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
