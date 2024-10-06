package Set;

import javax.naming.ldap.SortKey;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {
    public static void main(String[] args) {

        //Implementação, sem ser genérica
        Set set = new HashSet();
        Set set1 = new TreeSet();
        Set set2 = new LinkedHashSet();

        //Implementação, em Listas Set Genéricas

        Set <Double> somente_double = new HashSet<>();
        Set<Integer> somente_integer = new TreeSet<>();
        Set<Float> somente_float = new LinkedHashSet<>();
        Set <String> somente_String = new HashSet<>();





        /*
        Os três são implementações da interface Set em Java, mas têm características distintas:

HashSetExample:

Estrutura: Usa uma tabela hash.

Ordenação: Não garante a ordem dos elementos.

Performance: Tem complexidade média de O(1) para operações como adicionar, remover e verificar a presença de um elemento.
Uso: Ideal quando a ordem não importa e você precisa de alta performance.
TreeSet:

Estrutura: Usa uma árvore de busca binária (geralmente uma árvore rubro-negra).

Ordenação: Mantém os elementos ordenados de acordo com a ordem natural ou por um comparador fornecido.

Performance: Tem complexidade média de O(log n) para as operações básicas.
Uso: Útil quando você precisa de elementos em ordem ou de operações de intervalo.
LinkedHashSet:

Estrutura: Combina uma tabela hash com uma lista duplamente ligada.
Ordenação: Mantém a ordem de inserção dos elementos.
Performance: Tem complexidade média de O(1) para operações, semelhante ao HashSetExample, mas com um leve overhead devido à manutenção da lista.
Uso: Ideal quando você quer garantir a ordem de inserção, mas ainda deseja uma performance eficiente.
Resumindo:

Use HashSetExample para performance sem ordem.
Use TreeSet para elementos ordenados.
Use LinkedHashSet para manter a ordem de inserção com boa performance.
         */

    }
}
