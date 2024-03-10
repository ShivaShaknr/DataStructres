
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "a");
        ht.put(2, "b");
        ht.put(3, "c");
        ht.put(4, "d");
        ht.remove(2);
        System.out.println(ht);
        Iterator<Integer> itr = ht.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            String value = ht.get(key);
            System.out.print("Key: " + key + " Value: " + value + " ");
        }

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "shiva");
        hm.put(2, "shankar");
        hm.put(3, "janani");
        hm.put(4, "lavan");
        hm.put(5, "balaji");
        System.out.println(hm);
        if (hm.containsKey(1)) {
            String k = hm.get(1);
            System.out.println(k);
        }

        HashSet<String> hs = new HashSet<>();
        hs.add("shiva");
        hs.add("shankar");
        hs.add("janani");
        hs.add("lavan");
        hs.add("balaji");
        hs.add("shiva");
        System.out.println(hs.size());
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
