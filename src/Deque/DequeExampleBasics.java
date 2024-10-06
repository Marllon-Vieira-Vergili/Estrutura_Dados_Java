package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExampleBasics {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        //Queue mode

        deque.offerLast( "element 1");
        deque.offerFirst("element 2");

        String element1 = deque.pollFirst();
        String element2 = deque.pollLast();

        //stack mode

        deque.offerFirst("element 1");
        deque.offerFirst("element 2");

        element2 = deque.pollFirst();
        element1 = deque.pollFirst();
    }
}
