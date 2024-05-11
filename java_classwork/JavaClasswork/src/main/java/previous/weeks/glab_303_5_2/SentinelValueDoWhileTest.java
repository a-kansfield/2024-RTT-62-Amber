package previous.weeks.glab_303_5_2;

import java.util.Scanner;

public class SentinelValueDoWhileTest {
    // Checking to see if I could edit the Sentinel Value Demo to be more readable using do while
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int data;
        do {
            System.out.print("Enter an int value (the program exits if the input is 0: ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("The sum is " + sum);
    }
}
