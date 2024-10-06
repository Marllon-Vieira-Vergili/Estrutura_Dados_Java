package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInsertElements {
    public static void main(String[] args) {

        Queue<String> queue1 = new LinkedList<>();


        //Uma forma de inserir elementos no queue, utilizando o add

        queue1.add("Jiló");
        queue1.add("João");

        //outra forma de inserir elementos no queue, utilizando offer

        queue1.offer("marllon");
        queue1.offer("James Gosglin");

        System.out.println(queue1);

        //Ou...

        boolean added1 = queue1.add("Jonas");
        boolean added2 = queue1.add("carlos");

    boolean added3 = queue1.offer("sebastiao");
    boolean added4 = queue1.offer("pinto ribeiro");

    System.out.println(queue1);


    /*
    Resumindo: Podemos adicionar pelo queue, utilizando
    tanto o método add, quanto o método offer
     */
    }
}
