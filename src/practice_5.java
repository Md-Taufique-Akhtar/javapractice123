import java.util.Scanner;
public class practice_5 {
    public static void main(String[] args) {
        int length , width , area , parameter ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  length and width of trangle ");
        length = sc.nextInt();
        width = sc.nextInt();
        area = length * width;
        parameter = 2*(length + width );
        System.out.println(" area= "+ area  );
        System.out.println("parameter= " + parameter);

    }



}
