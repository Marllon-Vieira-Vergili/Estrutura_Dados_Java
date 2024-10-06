package Map;

import java.util.HashMap;
import java.util.Map;

public class JavaMapSize {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("123", "jane");
        map.put("456", "peter");

        //Verificar o tamanho do Map


        System.out.println(map.size());
        System.out.println(map.size() == 0); //false, tamanho do mapa não é igual a 0
        System.out.println(map.isEmpty()); //false, pois o mapa não está vazio.


        //Verificar se o map contem certa chave
        System.out.println(map.containsKey("123"));
        //ou se contem map
        System.out.println(map.containsValue("Maicon"));
    }
}
