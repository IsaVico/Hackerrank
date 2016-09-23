package day15;

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {

    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
        } else if (head.next == null) {
            head.next = new Node(data);
        }else{
            insert(head.next, data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        Node head = null;
//        int N = sc.nextInt();
//
//        while(N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head,ele);
//        }
//        display(head);
//        sc.close();

        Node head = null;
        int N = 4;
        int[] a = new int[4];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        a[3] = 1;
        int i = 0;

        while (N-- > 0) {
            int ele = a[i];
            i++;
            head = insert(head, ele);
        }
        display(head);
    }

}
