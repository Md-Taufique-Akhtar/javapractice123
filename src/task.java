/*public class task {
    public static void main(String[] args) {
        int a=5;
        if(a%2 == 0){
            System.out.println("this is even");
        }
        else{
            System.out.println("This is odd");
        }
    }
}*/


/*import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        if(n%2 == 0){
            System.out.println("This is even ");
        } else{
            System.out.println("This is odd ");
        }

    }


}*/
/*import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The person age: ");
        age=sc.nextInt();
        if(age>= 14 && age<= 55){
            System.out.println("A young person ");
        }
        else {
            System.out.println("not young ");
        }

    }
}*/
import java.util.Scanner;
public class task{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of three subjects : ");
        int m1 , m2 , m3;
       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
        float avg=(m1+m2+m3)/3;
        if(avg>=70){
            System.out.println("Grade A");
        }
        else if(avg>=60 && avg<=70){
            System.out.println("Grade B ");
        }
        else if(avg>= 50 && avg<=60){
            System.out.println("Grade C ");
        }
        else if(avg>= 40 && avg<= 50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade E ");
        }
    }
}
