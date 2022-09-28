package InterviewQuestions;

import java.util.Scanner;

public class CountCharacterOccurances {
    public static void main(String[] args) {
        String s = "Java Programming java opps";
        System.out.println(s.length());
        int total_count=s.length();
        int total_count_without_b =s.replace("a","").length();
        System.out.println("no of a in string "+(total_count-total_count_without_b));


    }

}
