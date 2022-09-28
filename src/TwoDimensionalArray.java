public class TwoDimensionalArray {
    public static void main(String[] args) {
        String x[][]=new String[3][5];
        System.out.println(x.length);  //total no of rows
        System.out.println(x[0].length);  //total no of columns

        x[0][0]="pradeep";
        x[0][1]="B";
        x[0][2]="A";
        x[0][3]="D";
        x[0][4]="E";

        x[1][0]="pramod";
        x[1][1]="G";
        x[1][2]="H";
        x[1][3]="K";
        x[1][4]="J";

        x[2][0]="pravin";
        x[2][1]="K";
        x[2][2]="O";
        x[2][3]="Z";
        x[2][4]="V";

//        System.out.println(x[0][4]);
//        System.out.println(x[2][4]);
//        System.out.println(x[1][3]);

        for (int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                System.out.println(x[i][j]);
            }
        }
    }
}
