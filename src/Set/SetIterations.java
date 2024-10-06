package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterations {
    public static void main(String[] args) {

        Set<String> set = Set.of("Hello", "World!", "10", "2", "3");

        // primeira forma de iterar uma lista Set
        //Podendo utilizar a classe Iterator

        //Iterator que vai percorrer String que chama iterator vai receber o set.iterator
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }


        //segunda forma de iterar uma lista utilizando for percorrendo lista toda
        //Iterar elementos do java set usando for-each loop
        for(String element: set){
            System.out.println(element);
        }


        //terceira forma de iterar uma lista
//Para um valor i que começa em 0, percorre o tamanho da minha lista e incrementa:
        for (int i = 0; i < set.size(); i++){
          //  Object next = set.get(i);
        }

        //quer iterar uma lista genérica?

        Iterator<String> iteratorString = set.iterator();
        while(iterator.hasNext()){
            String next = iteratorString.next();
        }

        //Iterar elementos em java set,utilizando a Java Streams API
        //Este vai ser feito em um exemplo em classe separada


    }
}
