package day9;

import java.util.Scanner;


public class Day9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
         int factorialNumber = scan.nextInt();
         
         System.out.println(factorial(factorialNumber));
    }
    
    private static int factorial(int number){
        if(number <= 1){
            return 1;
        }
        return number * factorial(number-1);
    }
}
