package InterviewQuestions;

import java.util.Scanner;

public class CheckGivenNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();

        int count=0;

        if(a>1){
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    count++;
                }
                if(count==2){
                    
                }
            }

        }else{
            System.out.println("It is not Prime numbers");
        }
    }
}
