import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LearnArrayList {
    public static void main(String[] args) {

//        ArrayList<String> StudentsName = new ArrayList<>();
////        size = n
////                n+n/2+1
//        StudentsName.add("Rakesh");

        //how to work add function
      /*  List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4); //this will be add 4 at the end of the list
        System.out.println(list);
        // how to add any element particular position
        list.add(1 , 50 ); //this will add 50 at position of 1
        System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(69);
        list.addAll(newList); //this will add all element
        System.out.println(list.get(1));*/

       List<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);
        /*list.remove(1); //this will remove the element of the index

        list.remove(Integer.valueOf(30)); //this will remove ...
        System.out.println(list);

        list.clear();
        System.out.println(list);
        //about time complexity big(N)
*/

        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is  "+list.get(i));
        }
for(Integer element: list){
    System.out.println("for each  element is  "+element);
}
        Iterator<Integer> it = list.iterator();
    while(it.hasNext()){
        System.out.println("iterator"+ it.next());
      }
    }
}
