package previous.weeks.pa_303_3_1;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String args[]){
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get strings to compare
        String s1 = getString(scanner);
        String s2 = getString(scanner);

        // Print sum to console
        System.out.println(stringSum(s1,s2));

        // Compare string values
        compareString(s1,s2);

        // Format and output text
        formatInput(s1,s2);
    }

    // Concatenates 2 strings and returns the length of the combined string
    public static int stringSum(String s1, String s2){
        return s1.concat(s2).length();
    }

    // Asks for string input and returns results
    public static String getString(Scanner scanner) {
        System.out.print("Type a string: ");
        return scanner.next();
    }

    public static void compareString(String s1, String s2) {
        int comparison = s1.compareTo(s2);
        if (comparison > 0) {
            System.out.println("Yes");
        } else if (comparison < 0) {
            System.out.println("No");
        } else {
            System.out.println("Strings are equal");
        }

    }

    public static void formatInput(String s1, String s2) {
        // First isolates the first character as its own substring. Then performs toUpperCase() on the single letter.
        // Finally adds the rest of the substring (starting at position 1) back in, and stores it back as initial var name.
        s1 = s1.substring(0,1).toUpperCase() + s1.substring(1);
        s2 = s2.substring(0,1).toUpperCase() + s2.substring(1);
        System.out.println(s1 + " " + s2);

    }
}
