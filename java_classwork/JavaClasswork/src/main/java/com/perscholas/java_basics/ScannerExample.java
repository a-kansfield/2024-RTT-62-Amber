package com.perscholas.java_basics;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc1.nextInt();

        System.out.print("The number is : " + num1);
    }
}
