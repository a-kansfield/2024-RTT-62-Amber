package Slides_303_6;

import java.util.Arrays;

public class ArrayInsertFunction {
    public static void main(String[] args) {
        ArrayInsert a = new ArrayInsert();
        // original array
        // pos   01234
        // value 12345

        int[] array = {1, 2, 3, 4, 5};
        Arrays.toString(array);

        // array after inserting
        // pos   012345
        // value 129345
        array = a.insert(array, 2,9);
        System.out.println(Arrays.toString(array));

        array = a.insert(array, 0,0);
        System.out.println(Arrays.toString(array));
    }
}
