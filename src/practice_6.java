import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {
        int math , english, computer , total; float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the marks of math ");
        math = sc.nextInt();
        System.out.println("enter the marks of english ");
        english = sc.nextInt();
        System.out.println(" enter the  marks of computer ");
        computer = sc.nextInt();
        total = math+ english+ computer;
        percentage = total/3;
        System.out.println("total marks ="+ total + " percentage= "+ percentage);

    }

}
