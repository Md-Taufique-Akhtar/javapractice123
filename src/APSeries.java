import java.util.Scanner;
public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("program to print AP series: ");
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter d value");
        int d=sc.nextInt();
        System.out.println("Enter n value");
        int n=sc.nextInt();
        int term=a;
        for (int i = 0; i < n; i++) {
            System.out.print(term+",");
            term=term+d;
        }
    }
}
