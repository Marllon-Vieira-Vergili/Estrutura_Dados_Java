package List;

import java.util.ArrayList;
import java.util.List;

public class AddElementsList {
    public static void main(String[] args) {

        List mylist = new ArrayList<>();
        List<Integer> mylistGeneric = new ArrayList<>();

        mylist.add("Object 1");
        mylist.add ("Object 2");
        mylist.add ("Object 3");
        mylistGeneric.add(4);
        //mylistGeneric.add("teste"); vai dar erro pois só pode genérico

        //case to remove semeome element
        mylist.remove(2);

    }

}
