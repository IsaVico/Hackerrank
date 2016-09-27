package day17;

import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int T=in.nextInt();
        //while (T-- > 0) {
//            int n = in.nextInt();
//            int p = in.nextInt();
/*

5 6
3 3
8 0
2 3
3 -3
         */
        int n = 3;
        int p = -3;
        Calculator myCalculator = new Calculator();
        try {
            int ans = myCalculator.power(n, p);
            System.out.println(ans);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // }

    }

    private static class Calculator {

        private int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }
            if (p == 0) {
                return 1;
            }
            int res = n;
            for (int i = 1; i < p; i++) {
                res = res * n;
            }
            return res;
        }
    }

}
