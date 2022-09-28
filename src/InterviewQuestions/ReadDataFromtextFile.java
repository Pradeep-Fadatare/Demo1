package InterviewQuestions;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromtextFile {
    public static void main(String[] args) throws IOException {
        /*FileReader fr=new FileReader("C:\\Users\\91956\\IdeaProjects\\Saurabh\\src\\My details.txt");
        BufferedReader br=new BufferedReader(fr);

        String str;

        while((str=br.readLine())!=null) {
            System.out.println(str);
        }*/

        //Approach 2:-
        File file = new File("C:\\\\Users\\\\91956\\\\IdeaProjects\\\\Saurabh\\\\src\\\\My details.txt");
        Scanner sc = new Scanner(file);

//        while(sc.hasNextLine()==true){
//            System.out.println(sc.nextLine());
//        }
//    }
        //Approch 2:-
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
    
}
