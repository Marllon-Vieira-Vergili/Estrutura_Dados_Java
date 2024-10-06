/*

O método `Set.of` em Java, introduzido no Java 9, é utilizado para criar conjuntos imutáveis de maneira simples e direta. Aqui estão suas principais características e funcionalidades:

1. **Imutabilidade**: Os conjuntos criados com `Set.of` são imutáveis, ou seja, não podem ser modificados após a sua criação. Isso significa que você não pode adicionar, remover ou alterar elementos. Tentar fazer isso resultará em uma `UnsupportedOperationException`.

2. **Elementos Únicos**: Assim como qualquer implementação de `Set`, os conjuntos criados com `Set.of` não permitem elementos duplicados.

3. **Sintaxe Simples**: A criação de um conjunto é feita de forma concisa, passando os elementos diretamente como argumentos. Por exemplo:
   ```java
   Set<String> frutas = Set.of("Maçã", "Banana", "Laranja");
   ```

4. **Limitação de Elementos**: O método suporta até 10 elementos como argumentos diretos. Para conjuntos com mais de 10 elementos, você pode passar um array:
   ```java
   Set<String> frutas = Set.of("Maçã", "Banana", "Laranja", "Morango", "Uva", "Pera", "Kiwi", "Cereja", "Manga", "Abacaxi", "Limão");
   ```

5. **Performance**: Os conjuntos imutáveis podem ser mais eficientes em termos de memória e desempenho, pois não precisam lidar com operações de modificação.

### Exemplo de Uso:
```java
import java.util.Set;

public class ExemploSetOf {
    public static void main(String[] args) {
        Set<String> frutas = Set.of("Maçã", "Banana", "Laranja");

        // Iterando sobre o conjunto
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Tentando adicionar um elemento (isto causará uma exceção)
        // frutas.add("Morango"); // Isso resultará em UnsupportedOperationException
    }
}
```

### Resumo
O `Set.of` é uma maneira conveniente e eficiente de criar conjuntos imutáveis em Java, ideal para situações onde você não precisa alterar o conjunto após sua criação.
 */

package Set;

import java.util.Set;
import java.util.TreeSet;

public class AddAllElementsJavaSet {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("Hello");
        set.add("World");
        set.add("1");
        set.add("2");
        set.add("3");

        //Para adicionar mais elementos
        set.addAll(Set.of("1", "9", "abc"));

        //Para remover mais elementos
        set.removeAll(Set.of("1", "9", "abc"));
        System.out.println(set);

    }
}
