public class evenoddinarray {
    public static void main(String[] args) {
        int[] arr1= { 1, 2, 5, 4, 7, 8, 11, 20};
        arrayEvenAndOdd(arr1);
    }
    public static void arrayEvenAndOdd(int arr[]) {
        int[] a =  new int[arr.length];
        int  index = 0;
        //add all the even numbers to resultant array
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 ==0){
                a[index] = arr[i];
                index++;
            }
        }
        //add all the odd numbers to resultant array
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 != 0) {
                a[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " , ");
        }
    }
}
