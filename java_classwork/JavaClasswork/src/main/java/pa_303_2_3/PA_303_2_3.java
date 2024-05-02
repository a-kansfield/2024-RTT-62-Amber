package pa_303_2_3;

public class PA_303_2_3 {
    public static void main(String args[]) {
        header(1);
        qOne(2);
        qOne(9);
        qOne(17);
        qOne(88);

        header(2);
        qTwo(150);
        qTwo(225);
        qTwo(1555);
        qTwo(32456);

        header(3);
        qThree();

        header(4);
        qFour();

        header(5);
        qFive();

        header(6);
        qSix();

        header(7);
        qSeven();
    }

    // Write a program that declares an integer a variable x, assigns the value 2 to it,
    // and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
    // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
    // Before printing the results, write a comment with the predicted decimal value and binary string.
    // Now, print out x in decimal form and in binary notation.

    public static void qOne(Integer x) {
        System.out.println("------------------------------------");
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;

        // Prediction: 1 (Incorrect, that would be right shift)
        System.out.println("Binary Notation: " + Integer.toBinaryString(x));
        System.out.println("Decimal Form: " + (double)x);
        // Result: 100
    }
    // Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string
    // version of the number. Now use the right shift operator (>>) to shift by 2 and assign the result to x.
    // Write a comment indicating what you anticipate the decimal and binary values to be. Now print the value
    // of x and the binary string.
    public static void qTwo(Integer x) {
        System.out.println("------------------------------------");
        System.out.println(Integer.toBinaryString(x));

        x = x >> 2;
        System.out.println("Value: " + x);
        System.out.println("Binary Notation: " + Integer.toBinaryString(x));


    }

    // Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
    // Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
    // Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
    public static void qThree() {
        int x = 7;
        int y = 17;
        int z;
        System.out.println("Int: "+ x +"\tBinary: " + Integer.toBinaryString(x));
        System.out.println("Int: "+ y +"\tBinary: " + Integer.toBinaryString(y));

        z = x & y;
        System.out.println("Result of Bitwise &:\n\tInt: " + z + "\n\tBinary: " + Integer.toBinaryString(z));
    }
    //Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
    // As before, write a comment that indicates what you predict the values to be before printing them out.
    public static void qFour() {
        int x = 7;
        int y = 17;
        int z;
        System.out.println("Int: "+ x +"\tBinary: " + Integer.toBinaryString(x));
        System.out.println("Int: "+ y +"\tBinary: " + Integer.toBinaryString(y));

        z = x | y;
        System.out.println("Result of Bitwise |:\n\tInt: " + z + "\n\tBinary: " + Integer.toBinaryString(z));
    }

    // Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator
    // to increase the value. Print the value before and after the increment operator.
    public static void qFive() {
        int i = 3;

        System.out.println("Before postfix increment: " + i);
        i++;
        System.out.println("After postfix increment: " + i);
    }
    // Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
    // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
    public static void qSix() {
        int i = 1;

        System.out.println("Initial value: " + i + "\n");

        i += 1;         // Increment 1
        System.out.println("Increment 1: " + i);
        i++;            // Increment 2
        System.out.println("Increment 2: " + i);
        ++i;            // Increment 3
        System.out.println("Increment 3: " + i);
    }

    // Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
    // Create another variable sum and assign the value of ++x added to y, and print the result.
    // Notice the value of the sum (should be 14).
    // Now change the increment operator to postfix (x++) and re-run the program.
    // Notice what the value of the sum is. The first configuration incremented x,
    // and then calculated the sum, while the second configuration calculated the sum, and then incremented x.

    public static void qSeven() {
        int x = 5;
        int y = 8;
        int sum = x++ + y;

        System.out.println(sum);


    }
    public static void header(int q){
        System.out.println("------------------------------------");
        System.out.println("Question " + q);
        System.out.println("------------------------------------");
    }


}
