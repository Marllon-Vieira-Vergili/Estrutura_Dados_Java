package Set;

import java.util.HashSet;
import java.util.Set;

public class SetAdd {
    public static void main(String[] args) {

//Para adicionar elementos ao Set

        Set<String> set = new HashSet<>();

        set.add("Hello world!");
        set.add("Olá muundo!");

        //Vamos adicionar também, utilizando o boolean do método add

        boolean added = set.add(("Helo"));
        boolean added2 = set.add("hellow!");

        System.out.println(added);
        System.out.println(added2);

        /*
        Voce irá observar que ele irá
        dar true e true
        pois ele está comparanto o set por ponteiro
        e não por id, se é a mesma coisa
         */

    }
}
