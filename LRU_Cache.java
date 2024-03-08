
import java.util.*;

public class LRU_Cache {
    Queue<Integer> q = new LinkedList<>();
    HashMap<Integer, Integer> hs = new HashMap<>();
    int size = 0;

    public LRUCache(int cap) {
        this.size = cap;
    }

    public int get(int key) {
        if (hs.containsKey(key)) {
            int t = hs.get(key);
            q.remove(key);
            q.add(key);
            return t;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (hs.containsKey(key)) {
            hs.remove(key);
            hs.put(key, value);
            q.remove(key);
            q.add(key);
        } else if (q.size() == size) {
            int t = q.poll();
            q.add(key);
            hs.remove(t);
            hs.put(key, value);

        } else {

            q.add(key);
            hs.put(key, value);

        }

    }

    public static void main(String[] args) {

    }
}
