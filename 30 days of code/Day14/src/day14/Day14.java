package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference(int[] a) {
        elements = a;
    }

    void computeDifference() {
       List<Integer> differenceElement = new ArrayList<Integer>();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                differenceElement.add(Math.abs(elements[i] - elements[j]));
            }
        }
        Collections.sort(differenceElement);
        maximumDifference = differenceElement.get(differenceElement.size()-1);
    }

}

public class Day14 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        sc.close();
int[] a = new int[3];
a[0] = 1;
a[1] = 2;
a[2] = 5;
        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
