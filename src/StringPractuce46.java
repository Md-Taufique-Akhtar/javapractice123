public class StringPractuce46 {
    public static void main(String[] args) {
        String str1 = "java Program";
        String str5 = "java Program";
        String str2 = new String("java");
        char c[] = {'h' , 'e' , 'l' ,'l' , 'o'};
        String str3 = new String(c, 1, 3);
        byte b[] = {65 , 66, 67, 68,69, 70};
        String str4 = new String(b, 1 , 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1 == str5);
    }
}
