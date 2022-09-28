package InterviewQuestions;

public class MaximumAndMinimuminArray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int max=a[0];
        for(int i =1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum value is = "+ max);

        int min=a[0];

        for(int i =1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Minimum value is = "+ min);
        System.out.println(a.length);
    }
}
