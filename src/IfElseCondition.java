public class IfElseCondition {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        if(b>a){
            System.out.println(b+" is greater than "+a);
        }else{
            System.out.println(a+" is greater than "+b);
        }
        int c=400;
        int d=500;
        int e=300;

        if(c>d & c>e){
            System.out.println("the gretest number is" + c);
        }else if(d>e){
            System.out.println("the gretest number is" + d);
        }else {
            System.out.println("the gretest number is  " + e);
        }
    }
}
