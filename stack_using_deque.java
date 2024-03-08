package Queue_Apna_College;

import java.util.*;

public class stack_using_deque {

    static Deque<Integer> d = new LinkedList<>();

    // add
    public static void add(int data) {
        d.addLast(data);
    }

    // remove
    public static int remove() {
        if (d.isEmpty()) {
            return -1;
        }
        int t = d.removeLast();
        return t;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);

        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());
        add(99);

    }
}
