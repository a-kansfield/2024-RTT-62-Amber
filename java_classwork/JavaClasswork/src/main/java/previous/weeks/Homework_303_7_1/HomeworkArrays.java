package previous.weeks.Homework_303_7_1;

import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        //Create an int array of length 10
        int[] nums = new int[10];
        int sum = 0;
        //Initialize the array to random integers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 10) + 1; //random number from 1-10
            sum += nums[i];

            System.out.println(nums[i]);
        }
        Arrays.sort(nums); // Sort array
        //I want you to get the smallest integer in the array
        System.out.println("Smallest num: " + nums[0]);
        //I want you to get the largest integer in the array
        System.out.println("Largest num: " + nums[nums.length - 1]);
        //I want you to calculate the average value in the array as a double.  Average is the sum of all elements in the array divided by the length of the array
        double average = (double)sum / (double)nums.length;
        System.out.println("Average: " + average);
    }
}
