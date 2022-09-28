package InterviewQuestions;

import java.util.Scanner;

public class ReverseAStringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String Name");
        String name=sc.next();
        String rev="";
        //Using Concadination Operator
        /*int length=name.length();
        for (int i=length-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Reverse of character =" +rev);*/

        /*char a[]= name.toCharArray();
        int len=a.length;
        for (int i=len-1;i>=0;i--){
            rev=rev+a[i];
            System.out.println(rev);
        }
        System.out.println("Final Reverse Order="+rev);*/

        StringBuffer sb=new StringBuffer(name);
        StringBuffer reverse=sb.reverse();
        System.out.println(reverse);


    }
}
