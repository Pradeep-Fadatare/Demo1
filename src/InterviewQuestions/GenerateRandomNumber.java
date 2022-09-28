package InterviewQuestions;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {

        Random rand=new Random();
        int Thousand=rand.nextInt(100);
        System.out.println(Thousand);

        double dbl=rand.nextDouble();
        System.out.println(dbl);

        //Approch 2 :-Using Math Class
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());

        
    }
}
