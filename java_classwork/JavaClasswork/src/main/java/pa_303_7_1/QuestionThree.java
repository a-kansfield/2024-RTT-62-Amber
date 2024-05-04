package pa_303_7_1;

import java.util.Arrays;

public class QuestionThree {
    //Write a program that creates an array of String type and initializes it with the strings
    // “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method.
    // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    public static void main(String[] args) {
        String[] ar1 = {"red", "green", "blue", "yellow"};

        System.out.println("Array length: " + ar1.length);

        String[] ar2 = ar1.clone();
        System.out.println("Copied array: " + Arrays.toString(ar2));
    }
}
