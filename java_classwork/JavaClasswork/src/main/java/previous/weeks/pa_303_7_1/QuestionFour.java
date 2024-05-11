package previous.weeks.pa_303_7_1;

public class QuestionFour {
    //Write a program that creates an integer array with 5 elements (i.e., numbers).
    // The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
    // Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
    // Now try to assign a value to the array index 5. You should get the same type of exception.

    public static void main(String[] args) {
        int[] ar = {4, 3, 1, 2, 7};

        System.out.println("First Index: " + ar[0]);
        System.out.println("Last Index: " + ar[ar.length - 1]);

        //System.out.println(ar[ar.length]);    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //ar[5] = 6;                            // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
