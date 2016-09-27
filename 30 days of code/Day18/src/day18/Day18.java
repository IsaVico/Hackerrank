package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Day18 {

    List<Character> word = new ArrayList<Character>();
    List<Character> reverseWord = new ArrayList<Character>();

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String input = scan.nextLine();
        //scan.close();

        String input = "racecar";
        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    private void pushCharacter(char c) {
        reverseWord.add(0, c);
    }

    private void enqueueCharacter(char c) {
        word.add(c);
    }

    private char popCharacter() {
        return reverseWord.get(0);
    }

    private char dequeueCharacter() {
        return word.get(0);
    }

}
