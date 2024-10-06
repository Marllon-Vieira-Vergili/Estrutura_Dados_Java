/*
Um SortedMap é uma interface no Java que representa um mapa que mantém suas entradas ordenadas de acordo com as chaves. Os elementos são organizados em uma ordem natural ou de acordo com um comparador fornecido. O SortedMap garante que as chaves sejam sempre mantidas em ordem.

Características do SortedMap:
Ordenação: As entradas são armazenadas em ordem, facilitando operações como iteração ordenada.
Interface: É uma extensão da interface Map, portanto, herda todos os métodos do Map, além de adicionar métodos específicos para manipulação de entradas ordenadas.
Exemplo com TreeMap:
O TreeMap é uma implementação comum do SortedMap. Aqui está um exemplo:

java


Saída:
makefile
Copiar código
apple: 5
banana: 3
orange: 2
Explicação do Exemplo:
Criação: Um SortedMap é criado usando TreeMap.
Inserção: Os pares chave-valor são adicionados ao mapa.
Iteração: Ao iterar sobre o sortedMap, os elementos são exibidos em ordem alfabética das chaves (apple, banana, orange).
Assim, um SortedMap é útil quando você precisa de um mapa com entradas que permanecem em ordem, facilitando buscas e iterações ordenadas.




 */

package Map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        // Criação de um SortedMap
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Adicionando pares chave-valor
        sortedMap.put("banana", 3);
        sortedMap.put("apple", 5);
        sortedMap.put("orange", 2);

        // Iterando sobre o SortedMap
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}

/*
Resumindo:
SortedMap é uma interface que define a ordenação em mapas.
TreeMap é uma implementação específica dessa interface, usando uma estrutura de árvore para manter a ordem das chaves.
Você pode pensar em SortedMap como um conceito (o que um mapa ordenado deve fazer) e TreeMap como uma das formas de implementá-lo (como um mapa ordenado realmente funciona).

SortedMap:

O que é? É como uma "receita" que diz que um mapa deve manter suas chaves em ordem.
Função: Ele não faz nada por si só; é apenas uma ideia de como um mapa deve se comportar.
TreeMap:

O que é? É uma das "receitas" que segue a ideia do SortedMap, mas que realmente funciona.
Como funciona? Ele usa uma estrutura especial (como uma árvore) para guardar as chaves em ordem. Assim, você pode encontrar e percorrer os itens de forma eficiente.
Resumindo:
SortedMap é a ideia de um mapa que mantém a ordem.
TreeMap é a implementação dessa ideia, que faz isso de verdade.
Pense no SortedMap como uma regra e no TreeMap como alguém que segue essa regra e faz o trabalho!




 */
