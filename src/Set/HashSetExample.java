/*

O HashSet em Java é uma implementação da interface Set que utiliza uma tabela hash para armazenar os elementos. Aqui estão algumas das principais características e funcionalidades do HashSet:

Armazenamento Não Ordenado: Os elementos em um HashSet não são armazenados em uma ordem específica. A ordem pode parecer aleatória e pode mudar ao longo do tempo.

Elementos Únicos: Um HashSet não permite elementos duplicados. Se você tentar adicionar um elemento que já está presente, a operação não terá efeito.

Performance: As operações básicas (adicionar, remover e verificar a presença de um elemento) têm uma complexidade média de O(1), tornando o HashSet muito eficiente para operações de busca.

Permite Nulos: O HashSet pode conter um único elemento nulo.

Não Sincronizado: O HashSet não é sincronizado, o que significa que não é seguro para uso em ambientes multithread sem algum tipo de controle de sincronização externo.

Em resumo, o HashSet é ideal para situações em que você precisa de uma coleção de elementos únicos e deseja operações de alta performance sem se preocupar com a ordem dos elementos.

Exemplo de Uso:
java





 */

package Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

            HashSet<String> frutas = new HashSet<>();
            frutas.add("Maçã");
            frutas.add("Banana");
            frutas.add("Laranja");
            frutas.add("Maçã"); // Tentativa de adicionar duplicado

            System.out.println(frutas); // Saída: [Banana, Laranja, Maçã] (a ordem pode variar)

            // Verificando a presença de um elemento
            System.out.println(frutas.contains("Banana")); // Saída: true
        }
    }

