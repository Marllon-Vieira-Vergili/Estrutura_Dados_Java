package Map;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveandClear {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("123", "Jane");
        map.put("456", "Peter");

        map.remove("123"); //remover apenas uma chave do mapa
        map.clear(); //remover tudo do mapa!!
        System.out.println(map.size()); //printar o tamanho do mapa
    }
}
