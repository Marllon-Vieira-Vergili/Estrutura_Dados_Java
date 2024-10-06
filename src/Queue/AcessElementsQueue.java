/*
Os métodos peek() e element() na interface Queue em Java são usados para acessar o elemento na frente da fila, mas têm algumas diferenças importantes:
1. peek()

    Função: Retorna o elemento no início da fila (cabeça) sem removê-lo.
    Retorno: Se a fila estiver vazia, retorna null.
    Uso: Útil quando você quer verificar qual é o próximo elemento a ser processado sem alterar a fila.

2. element()

    Função: Também retorna o elemento no início da fila (cabeça) sem removê-lo.
    Retorno: Se a fila estiver vazia, lança uma NoSuchElementException.
    Uso: Útil quando você deseja garantir que sempre haverá um elemento na fila, pois se a fila estiver vazia, você receberá uma exceção em vez de um valor null.

    Resumo

    peek(): Retorna null se a fila estiver vazia.
    element(): Lança uma exceção se a fila estiver vazia.

Esses métodos são úteis em cenários onde você precisa inspecionar a cabeça da fila sem removê-la, mas escolher entre um ou outro pode depender de como você deseja lidar com a situação em que a fila está vazia.
 */

package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class AcessElementsQueue {
    public static void main(String[] args) {

//Acessar elementos: Use peek() ou element().

        Queue<Integer> integerQueue = new LinkedList<>();


        integerQueue.add(2);
        integerQueue.offer(5);
        integerQueue.offer(9);
       integerQueue.offer(7);




        integerQueue.peek();
        //integerQueue.element();

        System.out.println(integerQueue);


    }
}
