package glab_303_13_2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public static void main(String[] args) throws IOException{
        //initializing two files in Array
        //path from source root works seemingly as well as absolute path on top of being more readable/less user specific.
        String[] inputFiles = { "./src/main/java/glab_303_13_2/file1.txt",
                                "./src/main/java/glab_303_13_2/file2.txt"};

        //Specify out file with path location
        //Files contents will be written in these files
        String outputFile = ".\\src\\main\\java\\glab_303_13_2\\nioOutput.txt";

        // Get Channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for(int i = 0; i < inputFiles.length; i++) {
            //Get channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();
            long size = inputChannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int)size);
            System.out.print((char) buf.get());
            while (inputChannel.read(buf) > 0) {
                buf.flip();
                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                    targetChannel.write(buf);
                }
            }

        }
    }
}
