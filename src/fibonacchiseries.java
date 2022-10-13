import java.util.Scanner;
//best way
//public class fibonacchiseries {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=0;
//        int b=1;
//        int n=sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.print(a+",");
//            int c=a+b;
//            a=b;
//            b=c;
//        }
//    }
//}

//abdul bari sir method

public class fibonacchiseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0, b=1,c;
        System.out.print(a+","+b+",");
        for (int i = 0; i < n-2; i++) {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}