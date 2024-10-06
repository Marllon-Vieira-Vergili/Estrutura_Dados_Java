/*

Um HashMap é uma estrutura de dados em Java que armazena pares de chave-valor. Ele é parte da coleção do Java e é usado para associar uma chave única a um valor correspondente, permitindo acesso rápido aos dados.

Características do HashMap:
Armazenamento Não Ordenado: Os elementos não são armazenados em uma ordem específica. A ordem pode mudar ao longo do tempo.

Chaves Únicas: Cada chave no mapa deve ser única. Se você adicionar uma chave que já existe, o valor associado a essa chave será sobrescrito.

Acesso Rápido: O HashMap oferece operações de inserção, busca e remoção com complexidade média de O(1), graças à sua implementação baseada em hashing.

Permite Nulls: Você pode ter uma chave nula e vários valores nulos.

Não Sincronizado: O HashMap não é thread-safe por padrão, o que significa que não é seguro para uso em ambientes com múltiplas threads sem controle adicional.

Quando Usar:
Use um HashMap quando precisar de acesso rápido a dados e não se importar com a ordem em que eles são armazenados. É útil para contagens, armazenamento de dados de configuração e outras situações onde a eficiência e a rapidez são importantes.
 */

package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "banana");
        map.put("23", "cebola");
        map.put("345", "alface");
        map.put("456", "cenoura");
        map.put("5678", "laranja");
        map.put("6789", "limao");
        map.put("7890", "beterraba");
        map.put("8", "ovo");
        map.put("9", "maça");


        for(String key: map.keySet()){
            System.out.println(key + " : " + map.get(key));

        }

        /*

        Perceba que a saída do resultado, entregará
        todos os dados, mas não de uma forma organizada.

         */
    }
}
