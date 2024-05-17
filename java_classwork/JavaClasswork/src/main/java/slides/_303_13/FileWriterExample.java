package slides._303_13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {

    public static void main(String[] args) {

        try {
            File output = new File("output.txt");

            FileWriter fileWriter = new FileWriter(output, false);

            for (int count = 0; count < 10; count++) {
                fileWriter.write("Line (" + count +  ") This is my first sentence writing to a file.\n");
            }


            // this tells the FileWriter to save its internal bugger right now, even if it is not totally full
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
