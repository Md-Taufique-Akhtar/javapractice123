import java.util.Scanner;

public class practice_4 {
    public static void main(String[] args) {
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        name = sc.nextLine();
        System.out.println("enter your age ");
        age = sc.nextInt();
        System.out.println(" hello "+ name + " , you are  "+ age + " years old. ");



    }
}
