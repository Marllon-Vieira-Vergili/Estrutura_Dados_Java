package Map;

import java.util.*;

public class MapExample {
    public static  void main(String[] args) {

        Map<String, String> hashmap = new HashMap<>();
        Map<String, String> hashset = new TreeMap<>();
        //most commons implementations

        Map<String, String> hashtable = new Hashtable<>();
        //implementations

        hashmap.put("Marllon", "Vieira");
        hashmap.put("Marcos", "da silva");
        hashmap.hashCode();

        System.out.println(hashmap);
        hashmap.get("Marllon");
        System.out.println(hashmap.size());

        if(hashmap.size() == 0){
            System.out.println(hashmap.isEmpty());

        }
        System.out.println(hashmap.containsValue("Marllon"));


    }
    //iterators in map

    //Iterator<String> keyIterator = hashCode().keySet().iterator();
    //or using for

    /*
    for (String key: map.keySet()){

        System.out.println(key);
        System.out.println(map.get(key));

     */
    }

