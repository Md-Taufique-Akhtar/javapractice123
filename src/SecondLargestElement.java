import java.util.Arrays;

public class SecondLargestElement {
    public static  int findSecondLargest(int[] arr) {
        Arrays.sort(arr); // method for sorting // array ko sourt kar ke da dagi assending orderd mai
        return arr[arr.length-2]; //return kar dega array ka seclast index pa mila ga seclastelement
    }

    public static void main(String[] args) {
        int []arr = {2, 13, 4, 1, 3, 6, 28};
        System.out.println(findSecondLargest(arr));
    }
}
//some issues in this code
//1. all element are same then how to find seclargelem