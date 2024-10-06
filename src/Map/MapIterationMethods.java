package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationMethods {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("123", "jane");
        map.put("2434", "Neo");


        //Primeira forma de se iterar um map, utilizando a classe Iterator
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String nextKey = iterator.next();
            System.out.println(iterator);
            System.out.println(map.get(nextKey));
        }

        //Segunda forma utilizando for-each

        for(String key: map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }

        /*Terceira forma, utilizando API Stream, utilizando expressão lambda
        map.entrySet().stream().forEach((Map.entry(<String, String> entry) ->)){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
         */
        }
    }
