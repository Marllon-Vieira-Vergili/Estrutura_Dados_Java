package List;

import java.util.ArrayList;
import java.util.List;

public class SizeOfList {
    public static void main(String[] args) {
        List mylist = new ArrayList<>();

        mylist.add("Object 1");
        mylist.add ("Object 2");
        mylist.add ("Object 3");



        //implementando o método size
        int size = mylist.size();
        System.out.println(mylist.size());
        //aqui ele vai falar o tamanho da minha lista

    }
}
