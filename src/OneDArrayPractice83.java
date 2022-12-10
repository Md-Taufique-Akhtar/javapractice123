//import java.util.Scanner;
//public class OneDArrayPractice83 {
//    public static void main(String args[]){
//        //1. finding sum of all elements
//        int []arr = {3, 9, 7, 8,12,6,15,5,4,10};
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);
//    }
//}



//import java.util.Scanner;
//public class OneDArrayPractice83 {
//    public static void main(String args[]) {
//        //Searching an element
//        int[] arr = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a key ");
//       int key= sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if(key == arr[i]){
//                System.out.println("Element found at : "+i);
//                System.exit(0);
//            }
//        }
//        System.out.println("not found ");
//       }
//    }

    //finding maximum element
//import java.util.Scanner;
//public class OneDArrayPractice83{
//    public static void main(String args[]){
//        int arr[] = {3 ,9,7,8,12,6, 15,5, 4,10};
//        Scanner sc =new Scanner(System.in);
//       int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//        }

        //Second largest element
import java.util.Scanner;
public class OneDArrayPractice83{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {3 ,9,7,8,12,6, 15,5, 4,10};
        int max1=arr[0] , max2=arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            if(max2<arr[i]){
                max2=arr[i];
              }

        }
        System.out.println("second largest element "+max2);
    }
}
