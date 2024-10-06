

/*

Em Java, uma fila é uma estrutura de dados que segue o
princípio FIFO (First-In-First-Out).
Você pode usar a interface Queue e suas implementações a
do Java Collections Framework. Aqui está uma visão geral
rápida e um exemplo de como usar uma fila em Java.

 */
package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementations {
    public static void main(String[] args) {

        Queue<String> stringQueue = new LinkedList<>();
        //Vai implementar uma lista de fila encadeada. cada elemento(nó)  vai ter uma referência ao próximo elemento ou o anterior

        Queue<Integer> integerQueue = new PriorityQueue<>();
        //Vai implementar uma fila de prioridade. Os elementos serão organizados de acordo com sua prioridade.

        Queue<Integer> integerQueue1 = new ArrayDeque<>();
        //implementar uma fila dupla(deque) usando um array. Permite acesso tanto do inicio quanto do fim.


/*
Resumo

    LinkedList: Boa para inserções e remoções frequentes; acesso lento.

    PriorityQueue: Processa elementos com base em prioridade; ideal para situações onde a ordem não é FIFO.

    ArrayDeque: Rápida para operações de fila e pilha; eficiente para acesso em ambas as extremidades.
 */

    }
}
