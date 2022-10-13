//import java.util.Scanner;
//public class typeofwebsite {
//    public static void main(String[] args) {
//        System.out.println("Enter a number:");
//        Scanner sc=new Scanner(System.in);
//        int day = sc.nextInt();
//        if(day ==1){
//            System.out.println("Monday");
//        }
//        else if(day == 2){
//            System.out.println("Tueasday");
//        }
//        else if(day == 3){
//            System.out.println("Wednesday");
//        }
//        else if(day == 4){
//            System.out.println("Thrusday");
//        }
//        else if(day == 5){
//            System.out.println("Friday");
//        }
//        else if(day == 6){
//            System.out.println("Saturday");
//        }
//        else if(day == 7){
//            System.out.println("Sunday");
//        }
//        else{
//            System.out.println("Invalid day number");
//        }
//    }
//}


import java.util.Scanner;
public class typeofwebsite {
    public static void main(String[] args) {
        System.out.println("Enter a url: ");
        Scanner scn= new Scanner(System.in);
     String url= scn.nextLine();

     String protocol = url.substring(0 , url.indexOf(":"));

     if(protocol.equals("http"))
         System.out.println("Hypertext Transfer protocol");
     else if(protocol.equals("ftp"))
         System.out.println("file transfer protocol");

     String ext =url.substring(url.lastIndexOf(".")+1);

     if(ext.equals("com"))
         System.out.println("comercial ");
     else if(ext.equals("org"))
        System.out.println("organization");
     else if(ext.equals("net"))
         System.out.println("network ");


    }
}