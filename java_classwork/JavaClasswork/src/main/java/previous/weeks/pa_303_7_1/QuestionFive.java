package previous.weeks.pa_303_7_1;

import java.util.Arrays;

public class QuestionFive {
    //Write a program where you create an integer array with a length of 5.
    // Loop through the array and assign the value of the loop control variable (e.g., i)
    // to the corresponding index in the array.
    public static void main(String[] args) {
        int[] ar = new int[5];

        for (int i = 0; i < ar.length; i++){
            ar[i] = i;
        }
        System.out.println(Arrays.toString(ar));
    }
}
