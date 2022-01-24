
//package com.company;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("It works ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        // int a = sc.nextInt();
        // System.out.print("Enter number 2 : ");
        // int b = sc.nextInt();
        // int Sum = a+b;
        // System.out.print("The sum is : ");
        // System.out.println(Sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();

    }

}