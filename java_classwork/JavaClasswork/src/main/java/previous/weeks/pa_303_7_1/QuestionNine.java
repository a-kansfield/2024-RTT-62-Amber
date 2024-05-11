package previous.weeks.pa_303_7_1;

import java.util.Arrays;

public class QuestionNine {
    //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    // Print the array in ascending order, and print the smallest and the largest element of the array.
    // The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    //The biggest number is 13
    public static void main(String[] args) {
        int[] nums = {4, 2, 9, 13, 1, 0};
        int temp;

        //focus on [i], and loop through entire array - set smallest int to nums[i]
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (nums[j] < nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print("Arrays in ascending order: ");
        for (int i = 0; i < nums.length; i++){
            if (i == nums.length - 1) {
                System.out.println(nums[i]);
            } else {
                System.out.print(nums[i] +", ");
            }

        }
        System.out.println("Smallest: " + nums[0] +"\t\tLargest: " + nums[nums.length - 1] );

    }
}
