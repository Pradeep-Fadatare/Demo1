package InterviewQuestions;

public class HowToRemoveAllWhideSpacesInString {
    public static void main(String[] args) {
        String spaces="I    am     Learning     Java     Programming";
        spaces=spaces.replaceAll("\\s","");
        System.out.println("After Removing The wide Spaces : "+spaces);

    }
}
