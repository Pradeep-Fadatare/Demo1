public class ArrayConcept {
    public static void main(String[] args) {
//        int i[]=new int[5];
//        i[0]=10;
//        i[1]=20;
//        i[2]=30;
//        i[3]=40;
//        i[4]=50;
//
//
//        System.out.println(i[0]);
//        System.out.println(i[1]);
//        System.out.println(i[2]);
//        System.out.println(i[3]);
//        System.out.println(i[4]);
//        System.out.println(i.length);
//
//        for (int j=0;j<i.length;j++){
//            System.out.println(i[j]);
//        }

        double d[]=new double[3];
        d[0]=12.33;
        d[1]=5.33;
        d[2]=3.33;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        char ch[]=new char[3];
        ch[0]='a';
        ch[1]=4;
        ch[2]='S';

        boolean b[]=new boolean[2];
        b[0]=true;
        b[1]=false;

        String st[]=new String[3];
        st[0]="hellow";
        st[1]="kill";
        st[2]="me";
        System.out.println(st.length);

        Object obj[]= new Object[5];
        obj[0]="pradeep";
        obj[1]=25;
        obj[2]="london";
        obj[3]='m';
        obj[4]=1996;
        System.out.println(obj[3]);
        System.out.println(obj.length);
    }
}
