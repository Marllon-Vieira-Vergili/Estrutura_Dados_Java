package List;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public static void main(String[] args) {

        /*
        mostrando uma lista genérica
        e não genérica
         */

        //Essa é a lista não genérica
        List myListNonGeneric = new ArrayList();

        //essa é a lista genérica, defini pra ela só aceitar String como exemplo
        List<String> MyListGeneric = new ArrayList<>();


        //Adicionei elementos nessa lista pra testar

        MyListGeneric.add(new String("Quatro"));
        MyListGeneric.add("Oitaum");
        //MyListGeneric.add(5);
        myListNonGeneric.add(5);
        myListNonGeneric.add("quarenta");

        /*
        Perceba que um eu adiciono na lista nao genérica
        qualquer tipo de dado que eu quero
        pode ser uma string, um número, não importa..

        enquanto que na lista genérica, eu não posso colocar
        um integer, pois só posso trabalhar com String, conforme
        eu mencionei
         */

    }
}
