package previous.weeks.pa_303_2_2;

import java.util.Scanner;

public class PA_303_2_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);       // Create scanner

        // Read 3 ints from input, each on their own line
        System.out.print("Input 1: ");
        int a = scanner.nextInt();

        System.out.print("Input 2: ");
        int b = scanner.nextInt();

        System.out.print("Input 3: ");
        int c = scanner.nextInt();

        System.out.println("------------------------");

        // return ints to console.
        System.out.println("Output 1: " + a);
        System.out.println("Output 2: " + b);
        System.out.println("Output 3: " + c);

        // There are three lines of input:
        //
        // The first line contains an integer.
        System.out.print("Input 1 (int): ");
        int a2 = scanner.nextInt();
        //    The second line contains a double.
        System.out.print("Input 2 (double): ");
        double b2 = scanner.nextDouble();
        //    The third line contains a String.
        System.out.print("Input 3 (String: ");
        String c2 = scanner.next();

        System.out.println("------------------------");

        // return ints to console.
        System.out.println("String): "   + c2);
        System.out.println("Double: " + b2);
        System.out.println("Int: " + a2);

        scanner.close();
    }
}
