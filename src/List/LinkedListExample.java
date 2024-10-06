/*
A LinkedList em Java é uma implementação da interface List que usa uma estrutura de dados de lista duplamente ligada. Aqui estão as principais características e funcionalidades da LinkedList:

Estrutura de Dados: Cada elemento da LinkedList (chamado de "nó") contém referências para o próximo e o anterior nó, permitindo a inserção e remoção eficiente de elementos.

Inserção e Remoção: A LinkedList permite inserções e remoções de elementos em qualquer posição com complexidade média de O(1) quando você já tem uma referência ao nó, ao contrário de uma ArrayList, que pode levar O(n) para inserir ou remover elementos no meio.

Acesso a Elementos: O acesso a elementos em uma LinkedList é mais lento em comparação com uma ArrayList, pois não possui acesso direto a índices. O tempo médio para acessar um elemento é O(n).

Armazenamento de Nulos: A LinkedList pode armazenar elementos nulos.

Implementação de Estruturas: Ela pode ser usada para implementar outras estruturas de dados, como filas e pilhas, aproveitando seus métodos de inserção e remoção.

Exemplo de Uso:
java


Resumo
A LinkedList é ideal para situações onde você precisa de frequentes inserções e remoções de elementos, especialmente em posições intermediárias, e não se importa tanto com a velocidade de acesso a elementos por índice.
 */

package List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> listaFrutas = new LinkedList<>();
        listaFrutas.add("Maçã");
        listaFrutas.add("Banana");
        listaFrutas.add("Laranja");

        // Adicionando um elemento na primeira posição
        listaFrutas.addFirst("Morango");

        // Removendo um elemento
        listaFrutas.remove("Banana");

        // Iterando sobre a lista
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }
        // Saída: Morango, Maçã, Laranja
    }
}

