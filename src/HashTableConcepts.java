import java.util.Hashtable;

public class HashTableConcepts {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put("A","Pradeep");
        ht.put("B","Pravin");
        ht.put("C","pramod");

        System.out.println(ht.size());
        ht.put(1,100);
        ht.put(2,200);

        System.out.println(ht.size());
        System.out.println(ht.get("C"));
        System.out.println(ht.get(1));
        ht.remove("C");
        System.out.println(ht.size());

    }
}
