

package Map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapImplementation {
    public static void main(String[] args) {

        //Formas de se implementar um Map

        /*
         map utiliza de uma forma de implementaçao de chave e valor, ou seja,
         uma chave irá receber aquele valor em específico, armazenado em memória.
         */


        Map<String, String> hashMap = new HashMap<>();
        //Um HashMap é uma estrutura de dados que armazena pares de chave-valor, permitindo acesso rápido a elementos.

        Map<String, String> hashSet = new TreeMap<>();
//o TreeMap é sempre ordenado, mas não permite chaves ou valores nulos. É ideal para situações em que a ordenação dos dados é importante.

        Map<String, String> linkedHashmap = new LinkedHashMap<>();
//Um LinkedHashMap é uma variante do HashMap que mantém a ordem de inserção dos elementos. Ele combina as características de um HashMap (acesso rápido e eficiência) com uma lista duplamente encadeada, que permite percorrer os elementos na ordem em que foram adicionados.

        Map<String, String> hashtable = new Hashtable<>();

        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        //SortedMap sortedMap = new TreeMap();
    }
}
