package InterviewQuestions;

public class SumOfElementInArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=0;
//        for (int i=0;i<a.length;i++){
//            sum=sum+a[i];
//        }
//        System.out.println("Total Sum Is = " +sum);

        //Enhanced For Loop
        for (int value:a){
            sum=sum+value;
        }
        System.out.println("Sum of elements ="+ sum);
    }
}
