package InterviewQuestions;

import java.util.Scanner;

public class FibinaccoSeriesExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        //1,2     3,5,
        int sum=0;
       System.out.print(a+" "+b);
        for(int i=2;i<10;i++){
            sum=a+b;
            System.out.print("    " +sum+"   ");
            a=b;
            b=sum;
        }
    }
}
