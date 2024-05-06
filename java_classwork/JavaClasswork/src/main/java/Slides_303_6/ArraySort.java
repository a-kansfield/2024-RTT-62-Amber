package Slides_303_6;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = {6, 0, 3, 5};

        for (int pos = 0; pos < array.length; pos++) {
            if (array[pos] > array[pos+1]) {
                int temp = array[pos];
                array[pos] = array[pos+1];
                array[pos+1] = temp;
            }
        }
    }
}
