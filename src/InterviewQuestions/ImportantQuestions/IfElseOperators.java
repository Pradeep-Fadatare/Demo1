package InterviewQuestions.ImportantQuestions;

public class IfElseOperators {
    private int num1;

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        if (num2 < num1) {
            System.out.println(num1 + " is greater");
        }else if (num1 == num2){
            System.out.println("number are equal");
        }else if(num1<num2){
            System.out.println(num2+ "number 2 is greater");
        }
    }
}
