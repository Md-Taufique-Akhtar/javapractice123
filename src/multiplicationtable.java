import java.util.Scanner;
//
//public class multiplicationtable {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();
//        //int a=sc.nextInt();
//        for (int i=1; i <= 10; i++) {
//            System.out.println(n+ " * "+i+" =    "+n*i  );
//        }
//    }
//}
//sum of n number
//public class multiplicationtable{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int sum=0;
//        int n=sc.nextInt();
//        for (int i = 1; i <=n; i++) {
//            sum+=i;
//            System.out.println(sum);
//        }
//        System.out.println(" sum of "+n+ " number is "+ sum);
//    }
//}

//factorial number
public class multiplicationtable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        long fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}