package Queue_Apna_College;

import java.util.*;

public class Interleavse_two_half {

    // Interleave The First Half Of The Queue With The Second Half
    public static void interFirst(Queue<Integer> q) {

        Queue<Integer> f = new LinkedList<>();
        int size = q.size();
        int i = 0;
        while (i != size / 2) {
            f.add(q.remove());
            i++;
        }
        
        //Here we change original queue 0(1) space ,, (also we create a new queue when space is 0(n))
        while (!f.isEmpty()) {
            q.add(f.remove());
            int t = q.remove();
            q.add(t);
        }

        System.out.println(q);
    }

    public static void main(String[] args) {
        Queue<Integer> f = new LinkedList<>();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        f.add(6);
        interFirst(f);
    }
}
