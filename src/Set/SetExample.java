package Set;


import java.util.*;


/*
Java set interface, representa
uma lista de coleções não ordenadas
que serão posteriormente ordenadas
e não repete números, como a lista normal
por exemplo:

24
3
89


enquanto a lista representa
uma coleção ordenada dos elementos e pode
ter elementos repetidos, pois não usa método equals
e hashcode

3
3
5
6
5
3

 */
public class SetExample {
    public static void main(String[] args) {

       // Set set = new HashSetExample(); pode declarar assim
        //ou como generic, como abaixo, que só aceitará string nessal ista

        Set <String> set = new HashSet<>();

        //Add elements to set

        boolean added = set.add("Hello");
        boolean added2 = set.add(("Hello"));

        System.out.println(added);
        System.out.println(added2);

        //Create set using set.of
        //Set <String> set2 = Set.of("Hello", "world", "1", "2", "3");

        Set<String> set3 = new TreeSet<>();
        set.add("Hello");
        set.add("world");
        set.add("1");
        set.add("2");
        set.add("3");
        //Iterate elements on the set, in 7 ways


        //the first way, is using the class iterator
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }

        //second way to iterate

        for (String element : set3){
            System.out.println(element);
        }
       /* Stream<String> stream = set.stream();
        stream.forEach(element) -> {System.out.println(element); });

    Exemplo usando stream

        */

        //To remove elements

        boolean removed1 = set.remove("1");
        boolean removedYes = set.remove("yes");

        System.out.println(removed1);
        System.out.println(removedYes);
        //set.clear(); para remover todos os elementos
        //set.removeAll(Set.of("1", "9", "abc"));



        //to add elements

        set.add("5");
        set.add("6");
        set.add("9");

        System.out.println(set);

        //retaining objects

        //set.retainAll(set.of("1", "9", "abc"));

        //java size, obtain a size of elements
        int size = set.size();

        //set if java contains

        boolean contains1 = set.contains("1");
        boolean contains8 = set3.contains("5");

        //convert set in a list

        //List<String> list = new ArrayList<>();
        //list.addAll(set);
    }
}
