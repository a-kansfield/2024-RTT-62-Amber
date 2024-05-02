package com.perscholas.java_basics;

public class Homework303_2_1 {
    public static void main(String[] args) {
        qOne();
        qTwo();
        qThree();
        qFour();
    }

    // Write a program that declares two integer variables, assigns an integer to each, and adds them together.
    // Assign the sum to a variable. Print out the result.
    public static void qOne() {
        linebreak(1);
        int numA = 5;
        int numB = 8;

        int sum = numA + numB;
        System.out.println("Sum of ints " + numA + " and " + numB + ": " + sum);
    }

    // Write a program that declares two double variables, assigns a number to each, and adds them together.
    // Assign the sum to a variable. Print out the result.
    public static void qTwo() {
        linebreak(2);
        double numA = 5.0;
        double numB = 10.0;

        double sum = numA + numB;
        System.out.println("Sum of doubles " + numA + " and " + numB + ": " + sum);

    }

    // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
    // Assign the sum to a variable. Print out the result. What variable type must the sum be?
    public static void qThree() {
        linebreak(3);
        int numA = 17;
        double numB = 6.4;
        double sum = numA + numB;   //Sum needs to be double in order to keep the same level of detail
                                    // Error when trying int: "java: incompatible types: possible lossy conversion from double to int"

        System.out.println("Sum of int " + numA + " and double " + numB + ": " + sum);
    }

    // Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
    // Assign the result to a variable. Print out the result.
    public static void qFour() {
        linebreak(4);
        int numA = 64;
        int numB = 2;

        int quotient = numA / numB;     // Note: The result will round down to the nearest int,
                                        // as a decimal will not be possible with an int.
        System.out.println("Part A: \n\tQuotient of ints " + numA + " and " + numB + ": " + quotient);

        // Now change the larger number to a decimal. What happens? What corrections are needed?
        // numA = 64.5;                         // Error: java: incompatible types: possible lossy conversion from double to int
        double doubleA = 64.5;                  // NumA needs to be converted to double. With primitives this does not seem to be possible.
                                                // But creating a new var is the simplest solution, since everything is literal anyway.

        double newQuotient = doubleA / numB;    // as long as newQuotient is double, numB can stay int.
        System.out.println("Part B: \n\tQuotient of double " + doubleA + " and int " + numB + ": " + newQuotient);
    }

    // Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
    // Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
    public static void qFive() {

    }

    // Formats between each question answer for convenience.
    public static void linebreak (int question){
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Question " + question);
        System.out.println("---------------------------------------------------------------");
    }
}
