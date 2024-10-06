package Map;

import java.util.HashMap;
import java.util.Map;

public class JavaMapNullKeyAndValue {
    public static void main(String[] args) {

//O Map aceita valores Null. Tanto na chave, quanto
        // no valor.


        Map<String, Integer> map  = new HashMap<>();

        map.put("abc", null);
        System.out.println(map); //repare que aqui ele irá imprimir o valor map, a sua chave e seu valor
        System.out.println(map.get("abc")); //Se eu der um map.get o valor de "abc", ele irá me retornar somente o
        // valor que está la dentro

        map.put(null,123);
        System.out.println(map.get(null));
    }
}
