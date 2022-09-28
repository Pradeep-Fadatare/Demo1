package InterviewQuestions;

import java.util.Scanner;

public class CountOddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num=sc.nextInt();
//        int num=43568798;
        int evencount=0;
        int oddcount=0;
        while (num>0){
            int remider=num%10;
            if (remider%2==0){
                evencount++;
            }else{
                oddcount++;
            }
            num=num/10;
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}
