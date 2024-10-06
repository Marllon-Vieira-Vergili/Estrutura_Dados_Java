/*
Você pode usar a API de Streams do Java para iterar sobre um `Set` de maneira eficiente e concisa. Aqui está um exemplo de como fazer isso com um `HashSet`:

### Exemplo de Uso com Stream API


```

### Explicação:
- **`frutas.stream()`**: Cria um stream a partir do conjunto `frutas`.
- **`filter(fruta -> fruta.startsWith("M"))`**: Filtra os elementos, mantendo apenas aqueles que começam com a letra "M".
- **`forEach(System.out::println)`**: Itera sobre os elementos filtrados e os imprime.

### Saída:
A saída deste código será:
```
Maçã
Morango
```

Este exemplo demonstra como usar a API de Streams para realizar operações em coleções de forma declarativa e concisa.
 */

package Set;

import java.util.HashSet;
import java.util.Set;

public class ExampleIterationUsingStreamAPI {
    public static void main(String[] args) {
        // Criando um HashSet
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Morango");

        // Iterando usando Stream API
        frutas.stream()
                .filter(fruta -> fruta.startsWith("M")) // Filtra as frutas que começam com "M"
                .forEach(System.out::println); // Imprime cada fruta filtrada

    }
}
