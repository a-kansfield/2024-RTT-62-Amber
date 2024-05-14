package glab_303_13_2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {
    public static void main(String[] args) throws IOException {

        //Input files
        String[] inputFiles = { "./src/main/java/glab_303_13_2/file1.txt",
                                "./src/main/java/glab_303_13_2/file2.txt"};

        //Files contents will be written in these files
        String outputFile = "./src/main/java/glab_303_13_2/OutputExampleTwo.txt";

        // Get channel for output file

        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();
        for (int i = 0; i < inputFiles.length; i++) {
            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }

        //Finally close the target channel
        targetChannel.close();
        fos.close();
    }
}
