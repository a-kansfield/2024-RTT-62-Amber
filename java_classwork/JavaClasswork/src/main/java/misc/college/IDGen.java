package misc.college;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

// Randomly generates an 8 digit ID, checks a csv file to ensure it does not already exist.
// If the number is unique, append the ID to the file and return the ID number
public class IDGen {
    static private final int    ID_LENGTH = 8;     //region Constants
                                                //      By convention, this is a variable that is IN_ALL_CAPS
                                                //      Separated by Underscores.
                                                //      Static:     it is a variable universal to every IDGen object
                                                //      Private:    Only used within the class, no need to make it public
                                                //      Final:      Will not allow this value to change anywhere else.
                                                //endregion
    private File                file;
    private Scanner             scan;
    private FileWriter          writer;

    //region Constructors
    //  Special method used when objects are created/initialized.
    //  This method is optional, but adding it will allow you to set values when the object is created.
    //
    //  Rules:      1. Method name needs to be the same as the class name
    //              2. Can't be abstract, final, or static
    //              3. No return type.
    //              4. Can't be called by itself. (It's run automatically when an object is created.)
    //endregion
    public IDGen(File file, Scanner scan, FileWriter writer) {
        this.file   = file;
        this.scan   = scan;
        this.writer = writer;
    } // Complete constructor with all variables

    // Single callable method in which all other methods are run.
    public int generateID() throws Exception{
        int id = generateNum();
        int count = 0;
        int countMax = 5;

        // Ensures the ID is not already in the file. If the ID exists, a new number is generated.
        // Count is a failsafe in case the program fails five separate times.
        while (!isUnique(id)) {
            generateNum();
            if (count >= countMax) {
                throw new Exception("Failed to generate unique ID after 5 attempts");
            }
            count++;
        }

        writeIDToFile(id);      // Save ID to cvs file
        return id;              // Return ID
    }
    // Generates a random 8-digit number and returns it as int
    private int generateNum() {
        StringBuilder idString = new StringBuilder();
        Random rand = new Random();     //region Random
                                        //  Class within Java.util that can generate a random integer
                                        //  the upper bound (second argument) is exclusive
                                        //endregion

        // creates ID int by int, if-else block ensures the ID does not start with 0
        for (int i = 0; i < ID_LENGTH; i++) {
            if (i == 0) {
                idString.append(rand.nextInt(1, 10));
            } else {
                idString.append(rand.nextInt(0, 10));
            }
        }
        return Integer.parseInt(idString.toString());
    }

    //return true if the num is not found in the given file
    private boolean isUnique(int id){
        File file       = getFile();
        Scanner scan    = getScan();
        boolean result  = true;

        while (scan.hasNextLine()) {
            int currentID = scan.nextInt();
            if (currentID == id){
                result = false;
            }
        }

        return result;

    }

    //Writes the ID to the given csv file.
    // May not be needed in the future, as I shift the csv to encompass all Student data.
    private void writeIDToFile(int id) throws Exception {
        getWriter().append("\n" + id);
        writer.close();
    }



    //Getters - No setters, I don't want to be able to change these after object creation
    public File getFile() {
        return file;
    }

    public Scanner getScan() {
        return scan;
    }

    public FileWriter getWriter() {
        return writer;
    }
}
