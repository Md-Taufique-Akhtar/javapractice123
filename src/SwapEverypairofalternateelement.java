    public class SwapEverypairofalternateelement {
        public static void swapalternate(int [] arr){
        int  temp; // local variable temp lea h
            for (int i = 0; i < arr.length-1 ; i+=2) {
                temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] =temp;
            }
    }
        public static void main(String[] args) {
            int [] arr = {9, 6, 12, 4, 32};
            System.out.println(" beforeswaping ");
            for (int x: arr) { 
                System.out.println(x);
            }
            swapalternate(arr);
            System.out.println(" after swaping ");
            for (int x: arr) {
                System.out.println(x);
            }
        }
}
