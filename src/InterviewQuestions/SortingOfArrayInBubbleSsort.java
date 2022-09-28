package InterviewQuestions;

import java.util.Arrays;

public class SortingOfArrayInBubbleSsort {
    public static void main(String[] args) {
        int a[]={3,2,5,4,1};
        int length=a.length;
        System.out.println("Array Before sorting : "+ Arrays.toString(a));

        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println("After Sorting: "+Arrays.toString(a));
    }
}
