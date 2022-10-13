public class SecLE {
    public static int findsecondLargest(int [] arr ){
        int max, secMax; //phela ye do variable le ge
        max=secMax=Integer.MIN_VALUE; //ab in dono ko integer ki min-value se initialized kare ge
        for(int x : arr){ // phir for each loop itrate kaye
            if(x>max) {
                secMax = max; //max ki curret value ko sec max ma dal do
                max = x; // aur jo x ha element us ko assing kare ge max ke ander
            }
            else{
                if(x>secMax && x!=max){ //agar x max se bada na hoto
                    secMax=x;
                }
            }
        }
        return secMax; //then return secMax
    }

    public static void main(String[] args) {
        int [] arr = {9, 12, 4, 21, 6, 3, 21 , 5 };

        System.out.println(findsecondLargest(arr));
    }
}
