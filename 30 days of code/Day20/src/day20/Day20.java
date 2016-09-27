package day20;

import java.util.Scanner;

class Sorter {

    int totalNumberOfSwaps;

    private void swap(int[] a, int position) {
        int temp = a[position];
        a[position] = a[position + 1];
        a[position + 1] = temp;
    }

    public void sortArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j);
                    numberOfSwaps++;
                }

            }
            totalNumberOfSwaps += numberOfSwaps;
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
    }

    void print(int[] a) {
        System.out.println("Array is sorted in " + totalNumberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
    }

}

public class Day20 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[] = new int[n];
//        for (int a_i = 0; a_i < n; a_i++) {
//            a[a_i] = in.nextInt();
//        }

        int n = 3;
        int a[] = new int[n];
        a[0] = 3;
        a[1] = 2;
        a[2] = 1;

        Sorter sorter = new Sorter();
        sorter.sortArray(a, n);
        sorter.print(a);

    }

}
