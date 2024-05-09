package sba.practice;

public class SBAPractice1 {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //Part 1 - Print characters of string s, on char at a time, new line each.

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        //Part 2 - Given the following strings convert them to int values Integer.valueOf();
        String ten = "10";
        String hundred = "100";

        System.out.println(Integer.valueOf(ten));
        System.out.println(Integer.valueOf(hundred));

        //Part 3 - Given an integer array find the sum of all the integers in the array.
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);

        // Part 4
        // given the array of strings convert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum+= Integer.valueOf(nums[i]);
        }
            System.out.println(sum);
    }
}
