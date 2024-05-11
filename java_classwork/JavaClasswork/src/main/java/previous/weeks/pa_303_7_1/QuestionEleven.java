package previous.weeks.pa_303_7_1;

import java.util.Scanner;

public class QuestionEleven {
    // Write some Java code that asks the user how many favorite things they have.
    // Based on their answer, you should create a String array of the correct size.
    // Then ask the user to enter the things and store them in the array you created.
    // Finally, print out the contents of the array.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] things = new String[getArraySize(scan)];
        scan.nextLine();            // Functionally does nothing, but clears the way for future .nextLine() calls.

        for (int el = 0; el < things.length; el++) {
            things[el] = getThing(scan);
        }

        System.out.println("Your favorite things are:");
        for (String el: things) {
            System.out.print(el + " ");
        }
    }

    public static int getArraySize(Scanner scan) {
        System.out.print("How many favorite things do you have?\n>>");
        return scan.nextInt();
    }

    public static String getThing(Scanner scan){
       System.out.print("Enter your thing: ");
       return scan.nextLine();
    }
}
