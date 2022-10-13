public class Regularexpression56 {
    public static void main(String []arg){
        String str = "aabccab";
        String str1= "mdtaufiqueakhtar4@gmail.com";
        System.out.println(str.matches(".+"));
        System.out.println(str.matches("[a-z]*"));
        System.out.println(str.matches("[abc]{3}"));
        System.out.println(str.matches("[abc]{3,7}"));
        System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));



    }
}
