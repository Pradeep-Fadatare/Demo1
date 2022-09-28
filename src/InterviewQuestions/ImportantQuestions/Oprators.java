package InterviewQuestions.ImportantQuestions;

public class Oprators {
    public static void main(String[] args) {
        String name="Pradeep";
        int number=12345;
        int number1=12345;
         number1++;
        number--;
        System.out.println(name+number);
        System.out.println(number1+number);
        System.out.println(number1);
        System.out.println(number);

        boolean bool=true;
        boolean bool1= !true;
        System.out.println(bool);
        System.out.println(bool1);

        if(number==number1){
            System.out.println("Numbers Are equal");
        }else{
            System.out.println("Numbers are not equal");
        }

        if(number==12344 && number1==12346){
            System.out.println("This is conditional operator");
        }

        if(number==12344 || number1==1){
            System.out.println("This is conditional operator");
        }
    }
}
