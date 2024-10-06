package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class PeekElementsInDeque {
    public static void main(String[] args) {
        Deque<String> deque2 = new ArrayDeque<>();

        deque2.offer("element 1");
        deque2.offer("element 2");

        String elementA = deque2.peek();
        String elementB = deque2.peekFirst();
        String elementC = deque2.peekLast();

        System.out.println("A: " + elementA);
        System.out.println("B" + elementB);
        System.out.println("C" + elementC);

        System.out.println("");

        String first = deque2.getFirst();
        String last = deque2.getLast();

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
