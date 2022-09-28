package InterviewQuestions;

import java.util.Scanner;

public class LArgestOf3Numbers {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int c=30;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers =");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
//
//        if(a>b & a>c){
//            System.out.println("Largest number is ="+a);
//        }else if(b>c){
//            System.out.println("Largest number is ="+b);
//        }else{
//            System.out.println("Largest number is ="+c);
//        }

        //Using Ternary Operators

        int Largest=a>b?a:b;
         Largest=c>Largest?c:Largest;
        System.out.println(Largest);


    }
}
