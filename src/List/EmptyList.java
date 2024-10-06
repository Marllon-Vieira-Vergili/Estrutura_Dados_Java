package List;

import java.util.ArrayList;
import java.util.List;

public class EmptyList {
    public static void main(String[] args) {



        /*
        How to empty a list using clear method

         */

        List mylist = new ArrayList<>();

        mylist.add("Object 1");
        mylist.add ("Object 2");
        mylist.add ("Object 3");


        //Agora vamos excluir todos os elementos dessa lista

        mylist.clear();
        System.out.println(mylist);

    }
}
