import java.util.Arrays;
public class sumofarray2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int j = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j--;

            }
            System.out.println(Arrays.toString(arr));

        }
    }
