import java.util.Queue;
import java.util.LinkedList;
public class LearnLinkedListQueueFIFO {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue);
        //peek , poll, offer


    }
}
