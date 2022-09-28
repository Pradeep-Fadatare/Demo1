package InterviewQuestions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\91956\\IdeaProjects\\Saurabh\\src\\newFile.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("God is not going to save me");
        bw.write("God is Greate");
        bw.write("God is loving me");
        bw.close();
    }
}
