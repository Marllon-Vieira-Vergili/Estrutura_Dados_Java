package Map;

import java.beans.Customizer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapGenericTypes {
    public static void main(String[] args) {

        //Aqui estou implementando Listas Generics de Map,
        //ou seja, só aceita os valores que eu decidir.

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "abc");
        stringMap.put(2, "bcd");
        //stringMap.put3.5,"Jiló");

        Map<String, Integer> customerMap = new TreeMap<>();
        customerMap.put("Primero", 2);

        //Aqui estou implementando estrutura map, que irá armazenar na forma de hashmap
        // mas que aceita vários tipos de dados. Float, Double, Integer, String, Boolean, etc
        Map map = new HashMap();
        map.put(123, "String");
        map.put("123", 789);
        map.put(false, 0);
        map.put(true, 1);


        System.out.println(stringMap);
        System.out.println(customerMap);
        System.out.println(map);
    }
}
