package previous.weeks.pa_303_7_1;

public class QuestionEight {
    // Write a program that creates a String array of 5 elements and swaps the first element
    // with the middle element without creating a new array.
    public static void main(String[] args) {

        String[] ar = {"a", "b", "c", "d", "e"};

        // get center
        int center = (ar.length / 2);

        swapArrayElement(ar, 0, center);
        for (String s : ar) {
            System.out.println(s);
        }

    }
    //Takes an array, and two positions to swap
    public static void swapArrayElement(String[] array, int first, int second) {
        String temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
