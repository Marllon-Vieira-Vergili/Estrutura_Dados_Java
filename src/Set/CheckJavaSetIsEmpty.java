/*
O método isEmpty() em Java é utilizado para verificar se uma coleção (como um Set, List, ou Map) está vazia. Aqui estão os principais pontos sobre o isEmpty():

Características do isEmpty():
Retorna um Valor Booleano: O método retorna true se a coleção não contém elementos e false caso contrário.

Uso Comum: É frequentemente usado para evitar operações em coleções vazias que poderiam causar erros ou comportamentos indesejados.

Simplicidade: É uma forma mais legível de verificar se uma coleção está vazia, em comparação com verificar se o tamanho é igual a zero (size() == 0).

O método isEmpty() é uma maneira prática e direta de verificar se uma coleção está vazia, melhorando a legibilidade do código e ajudando a evitar operações desnecessárias em coleções sem elementos.
 */

package Set;

import java.util.Set;
import java.util.TreeSet;

public class CheckJavaSetIsEmpty {
    public static void main(String[] args) {

        Set <String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Limão");
        set.add("Abacaxi");
        set.add("2");

        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);
    }
}
