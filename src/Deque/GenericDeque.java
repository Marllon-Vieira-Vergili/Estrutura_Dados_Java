package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class GenericDeque {
    public static void main(String[] args) {

        Deque deque = new ArrayDeque();
        deque.offer(Integer.valueOf(123));
        deque.offer("Hello, Deque");

        Integer element1 = (Integer) deque.poll();
        String element2 = (String) deque.poll();

        //now with generic, no need to casting

        Deque<String> deque2 = new ArrayDeque<>();
        deque2.offer("hello,deque");
        //deque2.offer(Integer.valueOf(123));
        String elements2_1 = deque2.poll();

    }
}
