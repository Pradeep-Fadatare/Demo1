package InterviewQuestions;

import java.util.Scanner;

public class SumOfDigitsInNUmberExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The NUmber :- ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int remider=num%10;
            sum=sum+remider;
            num=num/10;
        }
        System.out.println("Sum of didits = "+sum);
    }
}
