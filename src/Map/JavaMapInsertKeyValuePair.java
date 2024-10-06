package Map;

import java.util.HashMap;
import java.util.Map;

public class JavaMapInsertKeyValuePair {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("abc", Integer.valueOf(123));

        //Se adicionar outro valor na mesma chave, o java irá substituir o valor.
        map.put("abc", 789);
        //valueof converte um inteiro primitivo em um integer

        System.out.println(map);
    }
}
