/*
O TreeSet em Java é uma implementação da interface Set que utiliza uma árvore de busca binária (geralmente uma árvore rubro-negra). Aqui estão algumas das principais características e funcionalidades do TreeSet:

Ordenação: Os elementos em um TreeSet são armazenados em ordem natural ou em uma ordem definida por um comparador que você pode passar ao criá-lo. Isso significa que você pode percorrer os elementos em ordem crescente.

Imutabilidade: O TreeSet permite elementos duplicados. Ao tentar adicionar um elemento que já está presente, a operação não terá efeito.

Complexidade de Operações: As operações básicas, como adicionar, remover e verificar a presença de um elemento, têm uma complexidade média de O(log n), devido à estrutura de árvore.

Navegação: O TreeSet oferece métodos de navegação, como first(), last(), higher(), lower(), ceiling(), e floor(), que ajudam a acessar elementos em relação a outros de forma eficiente.

Uso de Comparador: Você pode fornecer um Comparator ao criar um TreeSet, o que permite personalizar a ordem dos elementos.

Desempenho: É útil quando você precisa de uma coleção ordenada e quer realizar operações que dependem da ordem dos elementos.



Em resumo, o TreeSet é ideal para cenários onde você precisa de uma coleção de elementos únicos que devem ser mantidos em ordem.

Exemplo de Uso:
 */



package Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(1);

        // Elementos em ordem crescente
        System.out.println(numeros); // Saída: [1, 3, 5, 8]

        // Navegação
        System.out.println(numeros.first()); // Saída: 1
        System.out.println(numeros.last()); // Saída: 8
    }
}


