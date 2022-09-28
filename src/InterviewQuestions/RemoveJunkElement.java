package InterviewQuestions;

public class RemoveJunkElement {
    public static void main(String[] args) {
        String a="@#$%^&*&^(*^% p#4rad$%^&eep 1fad234tar4566e";
        String b=a.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(b);
    }
}
