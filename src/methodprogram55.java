//public class methodprogram55 {
//    public static void main(String[] args) {
//        String str = "programmer@gmail.com";
//         int i = str.indexOf("@");
//         String uname= str.substring(0, i);
//         String dname= str.substring(i+1, str.length());
//         System.out.println(" username: "+ uname);
//        System.out.println(" Domain name: "+ dname);
//       // System.out.println("This is gmail id: " +dname.startsWith("gmail"));
//        int j= dname.indexOf(".");
//        String name = dname.substring(0,j);
//        System.out.println("This is gmail id: " +name.equals("gmail"));
//    }
//}
public class methodprogram55 {

    public static void main(String[] args) {
        String s = "programmer@gmail.com";
        String p[] = s.split("@");
        System.out.println("username: " + p[0] + " , " + "domain: " + p[1]);
        System.out.println(p[1].startsWith("gmail"));
    }
}
