import java.util.*;
public class yearisleap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year number");
        int year;
        year=sc.nextInt();
        if (year%4 == 0){
           if(year%100 == 0){
               if(year%400 == 0){
                   System.out.println("It is a leap year");
               }
               else
                   System.out.println("Not a leap year");
           }
           else{
               System.out.println("it is a leap year");
           }
        }
        else{
            System.out.println("not leap year");
        }
    }
}

