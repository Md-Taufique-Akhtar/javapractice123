import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("program to GP series");
        System.out.println("value of a ");
        int a=sc.nextInt();
        System.out.println("value of r ");
        int r=sc.nextInt();
        System.out.println("value of n ");
        int n=sc.nextInt();
        int term=a;
        for (int i = 0; i < n; i++) {
            System.out.print(term+",");
            term=term*r;
        }
    }
}
