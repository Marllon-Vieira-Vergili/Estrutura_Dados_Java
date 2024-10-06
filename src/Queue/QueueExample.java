package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        //Implementing queue interface

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue <Integer> queue3 = new PriorityQueue<>();

//boolean added1 = queue1.add(new Integer(3));
//queue3 = queue3.offer(new Integer(2);

queue3.size();
System.out.println(queue3);

//Integer queue3 = queue1.element();
//queue3.clear();
    }
}
