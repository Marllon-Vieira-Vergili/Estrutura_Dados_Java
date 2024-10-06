package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueGenericTypes {
    public static void main(String[] args) {


        /*Aqui estamos adicionando tipos genéricos na lista
         ou seja, só vai aceitar dados do tipo String

         é uma boa prática, pois organiza a lista
         para somente um determinado tipo de objeto

         */

        Queue<String> queue1 = new LinkedList<>();

        queue1.add("Jiló");
        queue1.add("João");
        queue1.add("maria");


        /*aqui não.. aqui estou criando uma lista
        do tipo queue, mas que pode receber
        qualquer tipo de dados..

        não é uma prática boa

         */
        Queue queue2 = new LinkedList();
        queue2.add("Marcos");
        queue2.add(2);
        queue2.add(false);
        queue2.add(3.8764332110);


        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(1234);
        integerQueue.add(764242);
        //integerQueue.add("UM, DOIS, TRÊS, QUATRO"); esse exemplo já não funciona




    }
}
