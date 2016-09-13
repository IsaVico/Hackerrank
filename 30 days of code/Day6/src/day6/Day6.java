/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            String newString = scan.next();
            String evenChar = "";
            String oddChar = "";

            for (int j = 0; j < newString.length(); j++) {
                if (j % 2 == 0) {
                    evenChar += newString.charAt(j);
                } else {
                    oddChar += newString.charAt(j);
                }
            }
            System.out.println(evenChar + " " + oddChar);
        }
    }

}
