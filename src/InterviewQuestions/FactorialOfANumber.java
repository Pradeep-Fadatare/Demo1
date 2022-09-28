package InterviewQuestions;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :-  ");
        int fact_num=sc.nextInt();
        long factorial=1;
//        for(int i=1;i<=fact_num;i++){
//            factorial=factorial*i;
//        }
//        System.out.println("Factorial Of "+fact_num+" = "+factorial);

        for(int i=fact_num;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial Of "+fact_num+" = "+factorial);
    }
}
