package slides.slides_303_3_3;

public class StringExample {
    public static void main(String args[]) {
        String str = "This is a string!";
        System.out.println("The length of the string = " + str.length());

        String str2 = str.toUpperCase();

        System.out.println(str);
        System.out.println(str2);

        String filename = "document.pdf";

        System.out.println("The file name is " + filename + " and the length is " + filename.length());
        System.out.println("The period is at index " + filename.indexOf('.'));

        // Way to check for extension of file. Looks for period, adds one to position and returns the rest of the string
        System.out.println("The file extension is " + filename.substring(filename.indexOf('.') +1));
        System.out.println("The name of the file is " + filename.substring(2, filename.indexOf('.')));


    }
}
