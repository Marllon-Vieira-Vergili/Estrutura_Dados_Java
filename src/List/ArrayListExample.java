
/*
Um ArrayList em Java é uma implementação da interface List que utiliza um array dinâmico para armazenar elementos. Aqui estão as principais características e funcionalidades do ArrayList:

Estrutura Dinâmica: Um ArrayList pode crescer e encolher conforme necessário. Quando o array interno se enche, o ArrayList automaticamente cria um novo array maior e copia os elementos existentes para ele.

Acesso Rápido: Acesso aos elementos é feito de forma rápida, com complexidade O(1) para operações de acesso por índice, já que usa um array internamente.

Inserção e Remoção: A inserção e remoção de elementos pode ser mais lenta em comparação a uma LinkedList, especialmente se ocorrerem no meio da lista. A complexidade média para inserir ou remover um elemento no meio é O(n), pois pode ser necessário deslocar elementos.

Permite Nulos: Um ArrayList pode conter elementos nulos.

Não Sincronizado: O ArrayList não é sincronizado, o que significa que não é seguro para uso em ambientes multithread sem controle de sincronização.

Exemplo de Uso:
java



Resumo
O ArrayList é ideal para situações em que você precisa de acesso rápido aos elementos por índice e não faz muitas inserções ou remoções em posições intermediárias. É uma das coleções mais utilizadas em Java devido à sua eficiência e facilidade de uso.





 */
package List;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Maçã");
        listaFrutas.add("Banana");
        listaFrutas.add("Laranja");

        // Adicionando um elemento na posição 1
        listaFrutas.add(1, "Morango");

        // Removendo um elemento
        listaFrutas.remove("Banana");

        // Iterando sobre a lista
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }
        // Saída: Maçã, Morango, Laranja
    }
}
