//public class nestedloop {
//    public static void main(String[] args) {
//        for (int i = 1; i < 5; i++) {
//            for (int j = 1 ; j < 7; j++) {
//                System.out.print("("+ i+","+j+")");
//            }
//            System.out.print("");
//        }
//    }
//}


//public class nestedloop {
//    public static void main(String[] args) {
//        for(int i=1; i<=5; i++){
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.print("\n");
//        }
//    }
//}


//public class nestedloop {
//    public static void main(String[] args) {
//        for (int i=1; i<=5; i++) {
//            for (int j=1; j <=5; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.print("\n");
//        }
//    }
//}

//ptrnn    1
//         1 2
//         1 2 3
//         1 2 3 4
//         1 2 3 4 5
//public class nestedloop {
//    public static void main(String[] args) {
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.print("\n");
//        }
//    }
//}


//                      1
//                      1 2
//                      1 2 3
//                      1 2 3 4
//                      1 2 3 4 5
//public class nestedloop {
//    public static void main(String[] args) {
//        int count=0;
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <= i; j++) {
//                count++;
//                System.out.print(j+" ");
//            }
//            System.out.print("\n");
//        }
//    }
//}

//public class nestedloop {
//    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <=5-i+1; j++) {
//
//                System.out.print(j+" * ");
//            }
//            System.out.print("\n");
//        }
//    }}

public class nestedloop {
    public static void main(String[] args) {
       int count=0;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5-i+1; j++) {
                count++;

                System.out.format("%02d " , count);
            }
            System.out.println("");
        }
    }}