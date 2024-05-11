package previous.weeks.pa_303_3_1;

import java.util.Scanner;

public class JavaSubstring {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println(s1.substring(3,7));
    }
}
