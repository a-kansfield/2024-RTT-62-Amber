package pa_303_12_2;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

class Result {
    public static void iterateAndDivide(int[] arr, int startAt, int endAt, int divideBy) {
        try {
            System.out.println("Dividing by " + divideBy + ":");
            if (startAt < endAt) {
                for (int i = startAt; i <= endAt; i++) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            } else {
                for (int i = startAt; i >= endAt; i--) {
                    System.out.println("  Index " + i + ": " + (arr[i] / divideBy));
                }
            }
            // Add catch blocks to handle any exceptions that may occur.
        } catch (Exception e){
            System.out.println(e.toString());
        }




    }
}

public class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Result.iterateAndDivide(arr, 2, 4, 2);
        Result.iterateAndDivide(arr, 2, 20, 1);
        Result.iterateAndDivide(arr, 10, 2, 0);
        Result.iterateAndDivide(arr, 10, -1, -2);
    }
}