package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterations {
    public static void main(String[] args) {
        List mylist = new ArrayList<>();

        mylist.add("Object 1");
        mylist.add ("Object 2");
        mylist.add ("Object 3");

        // primeira forma de iterar uma lista
        //Podendo utilizar a classe Iterator

        //Iterator (nome do iterator) vai receber nome da minha lista.iterator
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
        }


        //segunda forma de iterar uma lista utilizando for percorrendo lista toda
        ////para Objeto da classe object que vou chamar de next, que vai percorrer minha lista, fazer:
        for(Object next : mylist){
        }


        //terceira forma de itarar uma lista
//Para um valor i que começa em 0, percorre o tamanho da minha lista e incrementa:
        for (int i = 0; i < mylist.size(); i++){
            Object next = mylist.get(i);
        }

        //quer iterar uma lista genérica?

        Iterator<String> iteratorString = mylist.iterator();
        while(iterator.hasNext()){
            String next = iteratorString.next();
        }
    }
}
