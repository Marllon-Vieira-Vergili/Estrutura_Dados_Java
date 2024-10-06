package Set;

/*
O método retainAll em Java é utilizado para modificar um conjunto (ou uma lista) de forma que ele mantenha apenas os elementos que estão presentes em outra coleção. Aqui estão os principais pontos sobre o retainAll:

Características do retainAll:
Mantém Elementos Comuns: O retainAll remove todos os elementos do conjunto original que não estão contidos na coleção fornecida como argumento. Após a chamada desse método, o conjunto resultante conterá apenas os elementos que estão presentes em ambas as coleções.

Modifica o Conjunto Original: O método altera a coleção original, removendo os elementos que não estão na coleção especificada.

Retorno: O método retorna true se o conjunto foi alterado como resultado da chamada e false se não houve alterações.

Explicação do Exemplo:
Inicialmente, o conjunto frutas contém "Maçã", "Banana" e "Laranja".
O conjunto frutasParaManter contém "Banana" e "Morango".
Ao chamar frutas.retainAll(frutasParaManter), o conjunto frutas é modificado para conter apenas "Banana", pois é o único elemento presente em ambos os conjuntos.
Resumo
O retainAll é uma maneira útil de filtrar um conjunto, mantendo apenas os elementos que estão presentes em outra coleção, e pode ser especialmente útil em operações que envolvem interseções de conjuntos.


 */
import java.util.HashSet;
import java.util.Set;

public class SetRetainAll {
    public static void main(String[] args) {

        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        Set<String> frutasParaManter = new HashSet<>();
        frutasParaManter.add("Banana");
        frutasParaManter.add("Morango");

        // Mantém apenas as frutas que estão em frutasParaManter
        frutas.retainAll(frutasParaManter);

        // Resultado após retainAll
        System.out.println(frutas); // Saída: [Banana]
    }
}
