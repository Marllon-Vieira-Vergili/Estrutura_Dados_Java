package Queue;

import javax.print.DocFlavor;
import java.util.LinkedList;
import java.util.Queue;

public class TakeElementsQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("joanna");
        queue.offer("billl");


        /*
        Remover elementos: Use remove() ou poll().
         */

        queue.poll();
        //sempre retorna um valor null

        queue.remove();
        //sempre lança uma exceção

        System.out.println(queue);

    }
}
