package glab_303_6_1;

public class ArrayDemoTwo {
    public static void main(String[] args) {

        // Create an array
        int[] age = {12, 4, 5};

        // Loop through the array
        // using for loops
        System.out.println("Using for loop:");
        for(int i = 0; i < age.length; i++){
            System.out.println("Age " + (i + 1) + ": " + age[i]);
        }
    }
}
