public class Swastikpattern {
    public static void main(String[] args) {
        pattern1(4);

    }
    static void pattern1(int n) {
        for (int row = 1; row <= 4 ; row++) {
            //for every row , run the col 
            for(int col=3; col<=n; col--){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
               System.out.println();
        }
    }
}
