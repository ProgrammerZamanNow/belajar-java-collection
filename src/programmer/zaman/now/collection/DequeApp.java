package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
  public static void main(String[] args) {

    Deque<String> stack = new LinkedList<>();

    stack.offerLast("Eko");
    stack.offerLast("Kurniawan");
    stack.offerLast("Khannedy");

    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());

    Deque<String> queue = new LinkedList<>();
    queue.offerLast("Eko");
    queue.offerLast("Kurniawan");
    queue.offerLast("Khannedy");

    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());

  }
}
