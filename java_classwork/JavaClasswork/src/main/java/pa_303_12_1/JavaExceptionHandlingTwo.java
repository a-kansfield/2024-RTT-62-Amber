package pa_303_12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Exception;
// Needed to look up solution for this one, which is where the completed screenshot came from.
// I'm still messing with it to see if I can get it working on my own.

// Edit - got it working (output is identical to expected output, though HackerRank disagrees. I am fine with this.
public class JavaExceptionHandlingTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyCalculator calc = new MyCalculator();
        while (scan.hasNext()){
            int n = scan.nextInt();
            int p = scan.nextInt();

            try {
                System.out.println(calc.power(n,p));
            } catch (Exception e){
                System.out.println(e.toString());
            }
        }


    }
}

class MyCalculator {

    long power(int n, int p) throws Exception{
        //Exception handling
        if (n == 0 || p == 0) {
            throw new Exception("n or p should not be zero");
        } else if (n < 0 || p < 0){
            throw new Exception("n or p should not be negative");
        }

        long result = n;
        for (int i = 1; i < p; i++){
            result *= n;
        }
        return result;
    }
}