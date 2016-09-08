/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        /* Declare second integer, double, and String variables. */
        int newInteger;
        double newDouble;
        String newString;

        /* Read and save an integer, double, and String to your variables.*/
        newInteger = scan.nextInt();
        newDouble = scan.nextDouble();
        newString = scan.next();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + newInteger);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + newDouble);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + newString);

        scan.close();
    }
}
