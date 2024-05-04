package pa_303_7_1;

public class QuestionSeven {
    // Write a program where you create an array of 5 elements.
    // Loop through the array and print the value of each element, except for the middle (index 2) element.
    public static void main(String[] args) {
        int[] ar = {5, 7, 3, 1, 2};
        int middle = ar.length / 2;
        for (int i = 0; i < ar.length; i++) {
            if (i != middle) {
                System.out.println(i + ": " + ar[i]);
            }
        }
    }

}
