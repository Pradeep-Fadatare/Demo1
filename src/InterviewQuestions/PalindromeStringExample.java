package InterviewQuestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeStringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String =  ");
        String str=sc.nextLine();
        String org_str=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(org_str.equals(rev)){
            System.out.println(org_str +" is pallindrome");
        }else{
            System.out.println(org_str +" is not pallindrome");
        }
    }
}
