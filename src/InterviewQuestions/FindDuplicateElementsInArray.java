package InterviewQuestions;

import java.util.HashSet;

public class FindDuplicateElementsInArray {
    public static void main(String[] args) {

        String str[] = {"java", "python", "C++", "C#" };

        //Approach 1
       /* boolean flag=false;
        for (int i = 0; i< str.length; i++) {
            for (int j=i+1;j<str.length;j++){
                if (str[i]==str[j]){
                    System.out.println("Duplicate Element Found ="+ str[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("Duplicate Element not Found");
        }*/

        //Approach 2:

        boolean flag = false;
        HashSet<String> langs = new HashSet();
//        System.out.println(langs.add("java"));
//        System.out.println(langs.add("java"));
//        System.out.println(langs.add("C#"));
//        System.out.println(langs.add("python"));

        for (String s : str) {
            if (langs.add(s) == false) {
                System.out.println("Duplicate Element Found =" + s);
                flag = true;
            }

        }
        System.out.println(langs);
        if(flag==false){
            System.out.println("No duplicate Elements found");
        }
    }
}