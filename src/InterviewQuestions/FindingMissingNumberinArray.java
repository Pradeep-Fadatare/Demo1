package InterviewQuestions;

public class FindingMissingNumberinArray {
    public static void main(String[] args) {
        //Array should not contain duplicate number
        //Shoud not be sorted
        //Value should be in range
        int num[]={1,2,4,5,6};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<num.length;i++){
            sum1=sum1+num[i];
        }
        System.out.println("sum of array = "+ sum1);

        for(int i=1;i<=num.length;i++){
            sum2=sum2+i;
        }
        System.out.println("sum of array = "+ sum2);

        System.out.println("Missing Number is = " + (sum1-sum2));

    }
}
