package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddElementsToDeque {
    public static void main(String[] args) {

        Deque<String> deque1 = new ArrayDeque<>();

        deque1.add("element 1");
        deque1.addLast("Element 2");
        deque1.addFirst("element 3");

        System.out.println(deque1);

        Deque<String> deque2 = new ArrayDeque<>();

        deque2.offer("element1");
        deque2.offerLast("element 2");
        deque2.offerFirst("element 3");

        System.out.println(deque2);


        //add elements to beginning to deck
        deque2.push("element 4");
        System.out.println(deque2);
    }
}
