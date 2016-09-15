package day7;

import java.util.HashMap;
import java.util.Scanner;

public class Day7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> bookPhone = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            bookPhone.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (bookPhone.containsKey(s)) {
                System.out.println(s + "=" + bookPhone.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
