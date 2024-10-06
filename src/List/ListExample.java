package List;/*

    java util list interface é parte da api de coleções java

as formas mais comuns de implementação são
array list, linked list, e vector

vector não se implementa tanto

o array list é uma lista de objetos que se inicia
com um array de referência, e é muito rápido
de acesso, pois pula direto ao array necessário


o linked list é acessado através de ponteiros
ou nós, do anterior, ele consiste em elementos, mas é
lento para acessar elementos, por exemplo, para acessar
elemento 3, precisa acessar o 1, deois o 2, depois
o próximo elemento..

 */




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        //you can create one common list link this

        // List list = new ArrayList();

//or.. create a generic list, like this above
        List<String> myList = new ArrayList<String>();


        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");




        myList.remove(2);

        //String  firstObject =(String) myList.get(0);
        //cast is not necessary when your list is generic

        //ways to iterate a list

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

        }

        //second way
        for (Object next : myList) {
            next.getClass();
        }


        //the third way to iterate a list

        for (int i = 0; i < myList.size(); i++) {
            Object next = myList.get(i);
        }

        //method to clear a list

        myList.clear();
    }
}
