import java.util.Scanner;

public class webswitchCase {
    public static void main(String[] args) {
        Scanner SCAN=new Scanner(System.in);
        System.out.println("Enter Domain name: ");
        String domain=SCAN.nextLine();
        String ext = domain.substring(domain.lastIndexOf(".")+1);
        switch (ext){
            case "com":
                System.out.println("commercial ");
                break;
            case "gov":
                System.out.println("government ");
                break;
                case "org":
                System.out.println("Organization ");
                break;
                case "net":
                System.out.println("Network ");
                break;
            default:   System.out.println("invalid");

        }
    }
}
