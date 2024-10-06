
/*

Para converter um Set em uma List em Java, você pode usar o construtor da ArrayList,
que aceita uma coleção como argumento. Aqui está um exemplo de como fazer isso:

 */
package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertingSetToList {
    public static void main(String[] args) {
        // Criando um Set
        Set<String> frutasSet = new HashSet<>();
        frutasSet.add("Maçã");
        frutasSet.add("Banana");
        frutasSet.add("Laranja");

        // Convertendo Set para List
        List<String> frutasList = new ArrayList<>(frutasSet);

        // Exibindo a List
        System.out.println(frutasList);
    }
}

/*
Explicação
Criação do Set: Um HashSet é criado e alguns elementos são adicionados.
Conversão: Um novo ArrayList é criado a partir do Set, que contém todos os elementos do conjunto.
Impressão: Os elementos da List resultante são exibidos.
Resumo
A conversão de um Set para uma List é feita facilmente utilizando o construtor da ArrayList, que aceita uma coleção.
Isso permite que você aproveite as características da List, como a capacidade de acessar elementos por índice.
 */