package Queue_Apna_College;

import java.util.*;

public class First_non_rep {
    // First Non Reapting element in a stream -- time - 0(n)

    public static String firstNon(String s) {
        String ans = "";
        Queue<Character> q = new LinkedList<>();

        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            int in = ch - 'a';
            count[in] = count[in] + 1;
            while (!q.isEmpty()) {
                int t = q.peek() - 'a';
                if (count[t] == 1) {
                    ans = ans + q.peek();
                    break;
                }
                q.remove();
            }
            if (q.isEmpty()) {
                ans += "-1";
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // String s = "zz";
        // System.out.println(firstNon(s));
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(3);
        // q.add(9);
        // System.out.println(q.peek());
        

    }
}
