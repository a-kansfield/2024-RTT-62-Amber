package pa_303_12_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName()); // Needed .getClass().getName() to make HackerRank stop throwing a fit
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            scan.close();
        }
    }
}
