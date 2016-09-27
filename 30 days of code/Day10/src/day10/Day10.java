package daty10;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int number = 6;
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        int globalCont = 0;
        int localCont = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                localCont++;
            } else {
                if (localCont > globalCont) {
                    globalCont = localCont;
                }
                localCont = 0;
            }
        }
        if (localCont > globalCont) {
            globalCont = localCont;
        }
        System.out.println(globalCont);
    }

}
