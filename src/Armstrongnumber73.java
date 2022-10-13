import java.util.Scanner;
////Display number of digits
//public class Armstrongnumber73 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//          int n=sc.nextInt();
//          int r;
//          while(n>0){
//              r=n%10;
//              n=n/10;
//              System.out.println(r);
//          }
//            System.out.println(n);
//    }
//}


//public class Armstrongnumber73 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int nod=0;
//        int temp=n;
//        while(temp !=0){
//            temp = temp/10;
//            nod++;
//        }
//        int div = (int)Math.pow(10, nod-1);
//        while (div !=0){
//            int q= n/div;
//            System.out.println(q);
//            n=n%div;
//            div=div/10;
//        }
//    }
//}

//count digits of a number

//public class Armstrongnumber73{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//      int   n=sc.nextInt();
//      int count=0;
//      while(n>0){
//          n=n/10;
//          count++;
//      }
//        System.out.println("digits of numbers is "+ count);
//    }
//}

//Aramstrong number code
//public class Armstrongnumber73{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();int m=n;
//        int r;
//        int sum=0;
//        while(n>0) {
//            r = n % 10;
//            n = n / 10;
//            sum = sum + (r * r * r);
//        }
//        if(sum== n)
//        System.out.println("its a Armstrong number. ");
//        else
//            System.out.println("its not a aramstrong number. ");
//    }
//}

//reverse a number
//public class Armstrongnumber73{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int rev=0;
//        int r;
//        while(n>0){
//            r=n%10;
//            rev= rev*10+r;
//            n=n/10;
//        }
//        System.out.println("reverse number is "+ rev);
//    }
//}

//public class Armstrongnumber73{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        while(n>0){
//           int dig= n%10;
//           n=n/10;
//            System.out.println(dig);
//        }
//    }
//}

//palindrom or not
public class Armstrongnumber73{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int r;
        int m=n;
        while(n>0){
            r=n%10;
            rev= rev*10+r;
            n=n/10;
        }
        if(rev==m)
        System.out.println("it is a palindrom ");
        else
            System.out.println("it is not palindrom ");
    }
}

