package InterviewQuestions;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int b[]={8,6,5,4,3,9};

        //Extracting Even NUmbers
//        for(int i=0;i<b.length;i++){
//            if(b[i]%2==0){
//                System.out.println(b[i]+" is a even Number");
//            }
//            else{
//                System.out.println(b[i] +"  is a odd number");
//            }
//        }
        //Enhanced For loop
        for (int value:b){
            if(value%2==0)
                System.out.print("Even Numbers are="+value);
        }

    }
}
