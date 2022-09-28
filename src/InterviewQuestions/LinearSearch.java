package InterviewQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};

        int search_ele = 30;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (search_ele == a[i]) {
                System.out.println("Element is found =" + i + "th position " + a[i]);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Element Not Found");
        }
    }
}
