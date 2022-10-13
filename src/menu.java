import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("==== : ");
        System.out.println("ADD : ");
        System.out.println("SUB : ");
        System.out.println("MULT : ");
        System.out.println("DIV : ");
        System.out.println("Enter two number :");
         int a=sc.nextInt();
        int b= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in word: ");
        String option = sc.nextLine();
        option=option.toUpperCase();
        switch (option){
            case "ADD":
                System.out.println("sum is "+ (a+b));
                break;
            case "SUB":
                System.out.println("sub is "+ (a-b));
                break;
            case "MULT":
                System.out.println("mul is "+ (a*b));
                break;
            case "DIV":
                System.out.println("div is "+ (a/b));
                break;
            default :
                System.out.println("Invalid");
        }
    }
}
