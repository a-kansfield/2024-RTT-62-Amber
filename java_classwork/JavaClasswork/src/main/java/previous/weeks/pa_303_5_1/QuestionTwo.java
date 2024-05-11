package previous.weeks.pa_303_5_1;

import java.util.Scanner;

public class QuestionTwo {
    //Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
    //Examples:
    //Enter 2 and 4. The gcd is 2.
    //Enter 16 and 24.  The gcd is 8.
    //How do you find the gcd?
    //Name the two input integers n1 and n2.
    //You know number 1 is a common divisor, but it may not be the gcd.
    //Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
    public static void main(String[] args) {
        // Init
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;

        // Get input
        System.out.print("Get first int: ");
        n1 = scan.nextInt();
        System.out.print("Get second int: ");
        n2 = scan.nextInt();

        // check for smaller num. Swap if necessary
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("n1: " + n1 + "\tn2: " + n2);
        }
        //begin loop with i as smaller num (n1)
        for (int i = n1 ; i > 0 ; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)){
                System.out.println("Greatest Common Divisor: " + i);
                break;
            }
        }
    }
}
