/*public class practicingConditionalStatement {
    public static void main(String[] args) {
        int a=5, b=10 , c=15;
        int n=5;
        System.out.println(a<b && a<c);
        System.out.println(a<b || a<c);
        if(n>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }
}*/

public class practicingConditionalStatement {
    public static void main(String[] args) {
        int a=5 , b= 15 , c=4;
        if(a>b && a>c){
            System.out.println(a);
        }
        else if (b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
