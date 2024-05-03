package pa_303_3_1;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main (String args[]){
        // Initialize scanner
        Scanner scan = new Scanner(System.in);

        String input = getInput(scan);
        StringBuffer s = new StringBuffer(input);

        String newString = s.reverse().toString();                          // reverse will change the initial Stringbuffer as well!!

        if (input.equals(newString)) {                                      // Note: s.equals(sR) comes back always true
            System.out.println("Yes");                                    // I still am unsure why, but reversing on the same line as the if call seems to work
        } else {                                                          // Breakdown: s.toString() converts StringBuffer to string, allowing for .equals() check
            System.out.println("No");                                        // checks same string but in reverse, and then converts to string. If equal, print Yes, otherwise print No.
        }
    }

    // Get user input
    public static String getInput(Scanner scan) {
        System.out.print("Input a string to check for palindrome: ");
        return scan.next();
    }
}
