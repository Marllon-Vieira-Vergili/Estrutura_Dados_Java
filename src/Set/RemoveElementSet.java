package Set;

import java.util.Set;
import java.util.TreeSet;

public class RemoveElementSet {
    public static void main(String[] args) {


        Set<String> set = new TreeSet<>();

        set.add("Hello");
        set.add("World");
        set.add("1");
        set.add("2");
        set.add("3");

        //set.remove(3); //remove apenas um objeto


        set.clear(); //Remove todos os objetos
       // set.removeAll(); tem que colocar um argumento

        // ou pode fazer por método booleano que o remove aceita


        /*
        E chamei o remove para o elemento 1
        e no segundo exemplo, chamei o remove
        para o elemento "yes"
         */
        boolean removed1 = set.remove("1");
        boolean removed2 = set.remove("Yes");

        System.out.println(removed2);
        System.out.println(removed1);

    }
}
