package previous.weeks.glab_303_5_1;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string/number to check if it is a palindrome.\n>>");
        original = in.nextLine();
        int length = original.length();
        for (int i = length -1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number is not a palindrome.");
        }
    }
}
