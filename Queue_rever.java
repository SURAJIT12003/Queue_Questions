package Queue_Apna_College;

import java.util.*;

public class Queue_rever {

    // Queue reverse --- Time - 0(n) ,Space - 0(n)
    public static void reverse(Queue < Integer > q) {
        
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        //print element in reverse form 
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

        
    }
    public static void main(String[] args) {
        Queue<Integer> f = new LinkedList<>();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        f.add(6);
        reverse(f);
        //print element in reverse form 
        while(!f.isEmpty()){
            System.out.println(f.remove());
        }

    }
}
