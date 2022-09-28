package InterviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
//        Approach 1
        String str="Welcome to Java Selenium";
//        String words[]=str.split(" ");
//
//        String reverseString="";
//
//        for(String s:words){
//            String reverseword="";
//            for(int i=s.length()-1;i>=0;i--){
//                reverseword=reverseword+s.charAt(i);
//            }
//            reverseString =reverseString+reverseword+ " ";
//        }
//        System.out.println(reverseString);

        //Approch 2:-
        String[] word=str.split("\\s");
        String reverseword="";
        for(String s:word){
            StringBuilder sb=new StringBuilder(s);
            sb.reverse();
            reverseword=reverseword+sb.toString()+" ";
        }
        System.out.println(reverseword);
    }
}
