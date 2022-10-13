public class replacemethod {
    public static void main(String[] args) {
        String str = "a!B@c#1$2%3";
        String str1 = "abc   de fgh  ijk";
        String str2 = "   abc   de fgh  ijk gj    ";
        str2=str2.replaceAll("\\s+"," ").trim();
        String word[]=str2.split("\\s");
        System.out.println(word.length);
        System.out.println(str.replaceAll("[^a-zA-z0-9]", "")); //special character removing
        System.out.println(str1.replaceAll("\\s+","")); //space removing
    }
}
