package List;

import java.util.ArrayList;
import java.util.List;

public class AcessElementList {
    public static void main(String[] args) {

        List  mylist = new ArrayList();

        mylist.add(1);
        mylist.add(2);

        String firstObject = (String) mylist.get(0);
        //aqui fazendo um casting, pois como minha lista não é genérica, preciso deixar explícito pra ela que é uma string

    }
}
