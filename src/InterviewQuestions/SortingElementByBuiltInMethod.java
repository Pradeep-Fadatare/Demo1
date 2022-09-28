package InterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingElementByBuiltInMethod {

    public static void main(String[] args) {
//        int a[]={10,30,50,20,40};
//        System.out.println("Before Sorting : "+ Arrays.toString(a));

//        Arrays.parallelSort(a);
//        System.out.println("After Sorting : "+ Arrays.toString(a));

        //Approach 2
//        Arrays.sort(a);
//        System.out.println("After Sorting : "+ Arrays.toString(a));

        //In descending Order
        Integer b[]={10,30,50,20,40};
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("After Sorting : "+ Arrays.toString(b));
    }
}
