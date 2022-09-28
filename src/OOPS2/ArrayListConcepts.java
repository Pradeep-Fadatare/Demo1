package OOPS2;

import java.util.ArrayList;

public class ArrayListConcepts {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());
        ar.add("Ton");
        ar.add(100);
        ar.add('a');
        System.out.println(ar.size());
        System.out.println(ar.get(4));
        System.out.println(ar.get(6));
        for(int i=0;i<ar.size();i++) {
            System.out.println(ar.get(i));
        }

            ArrayList<Integer> ar1=new ArrayList<Integer>();
            ar1.add(100);
            ar1.add(101);
            ar1.add(102);
            ar1.add(103);
            System.out.println(ar1);

    }
}
