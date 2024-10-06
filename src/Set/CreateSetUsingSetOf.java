package Set;

import java.util.Set;

public class CreateSetUsingSetOf {
    public static void main(String[] args) {

        Set<String> set2 = Set.of("Hello", "World!");

        System.out.println(set2);
        set2.add("Concurso publico");
        System.out.println(set2);

       /*
       Set.of é um método introduzido no Java 9 que permite criar conjuntos imutáveis de forma concisa e fácil. Ele retorna uma instância de Set que não pode ser modificada após sua criação. Aqui estão algumas características importantes:

Imutabilidade: Os conjuntos criados com Set.of não podem ser alterados. Tentar adicionar ou remover elementos resultará em uma UnsupportedOperationException.

Sem duplicatas: Assim como qualquer implementação de Set, não permite elementos duplicados.

Sintaxe simples: Você pode criar um conjunto com uma linha de código, passando os elementos diretamente. Por exemplo:

java
Copiar código
Set<String> meuConjunto = Set.of("A", "B", "C");
Limitação de elementos: O método suporta até 10 elementos como argumentos diretos. Para mais de 10 elementos, você pode passar um array:

java
Copiar código
Set<String> meuConjunto = Set.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L");
Performance: Como os conjuntos são imutáveis, Set.of pode ser mais eficiente em termos de performance e uso de memória.

Em resumo, Set.of é uma maneira prática de criar conjuntos imutáveis em Java, ideal para situações em que você não precisa alterar o conjunto após a sua criação.
        */


    }
}
