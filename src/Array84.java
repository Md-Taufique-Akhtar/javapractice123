
import java.util.Scanner;
import java.util.Arrays;
public class Array84 {
    public static void main(String[] args) {
        int arr[]={5,9,6,10,12,7,3,5,4,2};
        for(int x:arr)
        System.out.print(x+",");
        System.out.println("");
        int temp=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            arr[i-1]=arr[i];
        }
           arr[arr.length-1]=temp;
        for(int x:arr)
        System.out.print(x+" , ");
        System.out.println("");
    }


//right rotation
//    public static void main(String[] args)
//    {
//        int [] A = {1,2,3,4,5};
//        for(int x:A)
//        {
//            System.out.print(x+ " ");//prints original array
//        }
//        System.out.println();
//
//        int temp=A[4];//holds last element
//
//        for (int i=A.length-1; i>0; i--)
//        {
//            A[i]=A[i-1];
//        }
//
//        A[0]=temp;
//
////Print out the array using Arrays class.....Test
//
//        System.out.println("Array after rotation = "+Arrays.toString(A));
//    }
}