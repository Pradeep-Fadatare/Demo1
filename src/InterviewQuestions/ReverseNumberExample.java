package InterviewQuestions;

import java.util.Scanner;

public class ReverseNumberExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");

        int num=sc.nextInt();

//        int rev=0;

//        while (num!=0){
//            rev=rev*10+num%10;  //0+1234%10=4 ,4*10+123%10=43 ,43*10+12%10=432, 432*10+1%10=43211
//            num=num/10;   //1234/10=123 , 123/10=23, 12/10=1, 1/10=0
//        }
//        System.out.println(("Reverse number is "+rev));

        // Using StringBuffer Class

       /* StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println(rev);*/

       //Using StringBuilder

        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev);


    }
}
