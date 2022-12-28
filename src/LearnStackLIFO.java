import java.util.Stack;

public class LearnStackLIFO {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("dog");
        animals.push("horse");
        animals.push("cat");
        animals.push("cow");
        System.out.println("Stack : "+ animals);

        System.out.println(animals.peek());

        animals.pop();
        System.out.println("Stack: "+ animals);

        System.out.println(animals.peek());
        //push, pop , peek
    }
}
