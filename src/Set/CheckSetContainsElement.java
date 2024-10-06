
/*
O método contains(Object o) em Java é utilizado para verificar se uma coleção (como um Set, List, ou Map) contém um elemento específico. Aqui estão os principais pontos sobre o contains:

Características do contains:
Retorna um Valor Booleano: O método retorna true se o elemento especificado está presente na coleção e false caso contrário.

Uso com Diferentes Coleções:

List: Verifica se o elemento está presente, considerando possíveis duplicatas.
Set: Verifica se o elemento está presente, sem permitir duplicatas.
Map: Pode ser usado para verificar se uma chave está presente no mapa.
Complexidade: A eficiência do método varia dependendo da implementação da coleção:

Em um HashSet, a complexidade média é O(1).
Em uma ArrayList, a complexidade é O(n), pois pode ser necessário percorrer a lista.

O método contains é uma maneira prática de verificar a presença de um elemento em uma coleção, sendo amplamente utilizado para garantir que um determinado valor já existe antes de realizar operações que dependem dessa verificação.





 */
package Set;

import java.util.Set;
import java.util.TreeSet;

public class CheckSetContainsElement {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Limão");
        set.add("Abacaxi");
        set.add("2");

        boolean contains1 = set.contains("1");
        boolean contains2 = set.contains("2");

       System.out.println(contains1);
       System.out.println(contains2);

    }
}
