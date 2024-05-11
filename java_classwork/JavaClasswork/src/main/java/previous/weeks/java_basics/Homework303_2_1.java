package previous.weeks.java_basics;

import java.text.DecimalFormat;

public class Homework303_2_1 {
    public static void main(String[] args) {
        qOne();
        qTwo();
        qThree();
        qFour();
        qFive();
        qSix();
        qSeven();
        qEight();

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
        double doubleA = 64.5;                  // NumA needs to be converted to double. (Can use Widening Casting)
                                                // But creating a new var is the simplest and most lossless solution, since everything is literal anyway.

        double newQuotient = doubleA / numB;    // as long as newQuotient is double, numB can stay int.
        System.out.println("Part B: \n\tQuotient of double " + doubleA + " and int " + numB + ": " + newQuotient);
    }

    // Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
    // Assign the result to a variable. Print out the result.
    public static void qFive() {
        linebreak(5);
        double numA = 100;
        double numB = 5;

        double dQuotient = numA / numB;
        System.out.println("Part A: \n\tQuotient of doubles " + numA + " and " + numB + ": " + dQuotient);

        // Now, cast the result to an integer. Print out the result again.
        int iQuotient = (int) dQuotient;      // Narrowing Casting: https://www.w3schools.com/java/java_type_casting.asp
        System.out.println("Part B: \n\tQuotient of same doubles cast as int: " + iQuotient);
    }

    //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
    // Declare a variable q and assign y/x to it and print q.
    public static void qSix() {
        linebreak(6);
        int x = 5;
        int y = 6;

        double q = y / x;                                                                   // type not specified in question, but double makes the most sense.
        System.out.println("Part A: \n\tQuotient of ints " + x + " and " + y + ": " +q);    // Does not seem to calculate decimal correctly. Result is 1.0

        // Now, cast y to a double and assign it to q. Print q again.
        q = (double) y /x;

        System.out.println("Part B: \n\tQuotient of int " + x + " and double " + y + ": " + q);      // Is now showing correctly as 1.2

    }

    // Write a program that declares a named constant and uses it in a calculation. Print the result.
    // Chose area of a circle
    public static void qSeven() {
        linebreak(7);
        final double PI = 3.14;
        double radius = 7;

        double area = PI * radius * radius;     // Could also use Math.pow to square
        System.out.println("The area of a circle with a radius of " + radius + " is " + area);

    }

    // Write a program where you create three variables that represent products at a cafe.
    // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
    // Assign prices to each product. Create two more variables called subtotal and totalSale
    // and complete an “order” for three items of the first product, four items of the second product,
    // and two items of the third product. Add them all together to calculate the subtotal.
    // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
    // Be sure to format the results to two decimal places.
    public static void qEight() {
        linebreak(8);

        // Constants
        final double SALES_TAX = 0.12;

        DecimalFormat df = new DecimalFormat("0.00");
        // Products
        double coffee = 3.49;
        double tea = 2.99;
        double frappe = 5.49;

        // Totals
        double subtotal;
        double totalSale;

        //add subtotal
        subtotal = (coffee * 3) + (tea * 4) + (frappe * 2);
        totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Sales Tax: " + df.format(subtotal * SALES_TAX));
        System.out.println("Total: " + df.format(totalSale));

    }

    // Formats between each question answer for convenience.
    public static void linebreak (int question){
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Question " + question);
        System.out.println("---------------------------------------------------------------");
    }
}
