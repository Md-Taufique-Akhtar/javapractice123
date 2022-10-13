import java.util.Arrays;
public class Seclargestelement {
    public static int findecondLargest(int[] arr){
        Arrays.sort(arr);
        //hum log loop chalye gae, backward direction se
        for (int i = arr.length-1; i > 0 ; i--) {
            //is loop ma if condition use karega phir pata kare ga ke ye element plale wale element se
            //diff h to secondle h
            if(arr[i]!= arr[i-1]){
              return arr[i-1];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        //int [] arr = {9, 9, 9, 9, 9 ,9}; //loop ka if condition kabhi true nahi hoga
        int [] arr = {9, 12, 4, 11, 6, 3, 21, 5}; // tc nlogn aaye ga iska
        System.out.println(findecondLargest(arr));
    }
}
