/*
Um TreeMap é uma estrutura de dados em Java que implementa a interface SortedMap. Ele armazena pares de chave-valor de forma ordenada, permitindo que você acesse os dados em uma sequência específica.

Características do TreeMap:
Ordenação: As entradas são armazenadas em ordem crescente de suas chaves. Essa ordem pode ser a ordem natural das chaves ou definida por um comparador fornecido ao criar o TreeMap.

Chaves Únicas: Assim como no HashMap, cada chave deve ser única. Se uma chave já existe, seu valor associado será sobrescrito.

Complexidade: As operações de inserção, busca e remoção têm complexidade O(log n), devido à estrutura de árvore (geralmente uma árvore vermelha-preta) utilizada para armazenar os dados.

Não Permite Nulls: Não permite chaves nulas, mas permite valores nulos.

Thread-Safe: O TreeMap, como o HashMap, não é sincronizado por padrão. Se for necessário acesso simultâneo por várias threads, você deve usar um controle externo para garantir a segurança.

Quando Usar:
Use um TreeMap quando precisar de um mapa que mantenha suas chaves ordenadas e você deseja iterar sobre os elementos em ordem. É útil para cenários em que a ordenação é importante, como relatórios, classificações e algoritmos que dependem da ordem dos elementos.

 */
package Map;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapImplementation {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("1", "banana");
        map.put("34", "cebola");
        map.put("23", "alface");
        map.put("56", "cenoura");
        map.put("45", "laranja");
        map.put("76", "limao");
        map.put("87", "beterraba");
        map.put("98", "ovo");
        map.put("900", "maça");


        for(String key: map.keySet()){
            System.out.println(key + " : " + map.get(key));

        }
    }
}
