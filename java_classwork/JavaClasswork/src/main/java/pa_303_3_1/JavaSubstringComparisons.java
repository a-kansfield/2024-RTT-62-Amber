package pa_303_3_1;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main (String args[]) {

        // Initialize scanner
        Scanner scan = new Scanner(System.in);

        // Get user inputs
        String s = getStr(scan);
        int strLen = getSubStrLen(scan);

        // Create vars
        String smallest = s.substring(0,strLen);
        String largest = "";
        String newS;

        // Loops through every letter in the string, stopping when there's strLen characters left (Seems to be 1-based, had to subtract 1 from strLen
        for (int i = 0; i < (s.length() - (strLen - 1)); i++) {
            newS = s.substring(i, i + strLen);              // The current substring. Encompasses i through previously supplied substring length

            if (newS.compareTo(largest) > 0) {              // Checks if the new substring is larger than the current largest.
                largest = newS;                             // If so, replace current largest with new largest.
            }
            else if (newS.compareTo(smallest) < 0) {        // Checks same new substring to see if it is smaller than the smallest
                smallest = newS;                            // Switched to else if for optimization purposes.
            }

        }

        // Output result
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

    }

    // Prompts user for a string value
    public static String getStr(Scanner scan) {
        System.out.print("Type a string: ");
        return scan.next();
    }

    // Prompts user for an int value (Substring length)
    public static int getSubStrLen(Scanner scan) {
        System.out.print("Input substring length as int: ");
        return scan.nextInt();
    }
}
