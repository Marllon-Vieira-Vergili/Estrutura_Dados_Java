package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListImplementation {
    public static void main(String[] args) {


        //Lista não genérica que aceita qualquer tipo de dado armazenado em arraylist
        List mylist = new ArrayList();

        //Lista do tipo genérico definida para aceitar só string, que vai armazenar utilizando a classe arraylist
        List< String> list = new ArrayList<>();

        //Lista do tipo genérico definido para aceitar só String, mas que vai armazenar utilizando Linked List, ou seja, ponteiros
        List<String> list2 = new LinkedList<>();

        //Lista do tipo genérico definido para aceitar somente String, que vai armazenar na classe tipo vector (obsoleta)
        List<String> list3 = new Vector<>();


    }
}
