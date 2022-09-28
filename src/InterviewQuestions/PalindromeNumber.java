package InterviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num=sc.nextInt();
        int org_num=num;

        int rev=0;
        while (num!=0){
            rev=rev*10+org_num%10;
            num=num/10;
        }
        if(org_num==rev){
            System.out.println(org_num+"    Given Number Is Pallindrome Number");
        }else {
            System.out.println(org_num+"    Given Number Is Not a Pallindrome Number");
        }

    }
}
