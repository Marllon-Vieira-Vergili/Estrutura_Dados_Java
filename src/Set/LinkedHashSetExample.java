/*


O `LinkedHashSet` em Java é uma implementação da interface `Set` que combina as características de um `HashSet` e de uma lista duplamente ligada. Aqui estão as principais características e funcionalidades do `LinkedHashSet`:

1. **Manutenção da Ordem de Inserção**: Diferentemente do `HashSet`, que não garante a ordem dos elementos, o `LinkedHashSet` mantém a ordem em que os elementos foram inseridos. Isso significa que ao iterar sobre o conjunto, os elementos aparecerão na mesma ordem em que foram adicionados.

2. **Elementos Únicos**: Assim como os outros conjuntos, o `LinkedHashSet` não permite elementos duplicados. Tentar adicionar um elemento que já está presente não terá efeito.

3. **Performance**: As operações básicas (adicionar, remover e verificar a presença de um elemento) têm uma complexidade média de O(1), como no `HashSet`. No entanto, há um leve overhead devido à manutenção da lista ligada.

4. **Permite Nulos**: O `LinkedHashSet` pode conter um único elemento nulo.

5. **Não Sincronizado**: Assim como o `HashSet`, o `LinkedHashSet` não é sincronizado, então você deve usar um controle de sincronização se for acessá-lo de múltiplas threads.

### Exemplo de Uso:
```java


    }
}
```

### Resumo
O `LinkedHashSet` é ideal quando você precisa de uma coleção de elementos únicos e deseja garantir a ordem de inserção. Ele combina a eficiência de busca do `HashSet` com a preservação da ordem, tornando-o útil em várias situações.
*/
package Set;


import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> frutas = new LinkedHashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã"); // Tentativa de adicionar duplicado

        // A ordem de inserção é mantida
        System.out.println(frutas); // Saída: [Maçã, Banana, Laranja]

        // Verificando a presença de um elemento
        System.out.println(frutas.contains("Banana")); // Saída: true
    }
}
