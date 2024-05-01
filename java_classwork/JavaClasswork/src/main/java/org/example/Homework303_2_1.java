package org.example;

public class Homework303_2_1 {
    public static void main(String[] args) {
        // Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        int numOneI = 5;
        int numTwoI = 8;

        int sum = numOneI + numTwoI;

        System.out.println(sum);

        //Write a program that declares two double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.

        double numOneD = 5.0;
        double numTwoD = 10.0;

        double sumTwo = numOneD + numTwoD;
        System.out.println(sumTwo);

        // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?

        int numThreeI = 17;
        double numThreeD = 6.4;
        double sumThree = numThreeI + numThreeD; //Sum needs to be double in order to keep the same level of detail
        System.out.println(sumThree);

        //Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable. Print out the result. Now change the larger number to a decimal.
        // What happens? What corrections are needed?
        int v1 = 80;
        int v2 = 50;

        double sum4 = v1 / v2;

    }
}
