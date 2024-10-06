package List;

import java.util.ArrayList;
import java.util.List;

public class ListPracting {
    public static void main(String[] args) {


        List<Integer> number = new ArrayList<Integer>();


        //addictioning numbers
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        number.remove(2);

       /* Iterator iterator = number.iterator();
        while(iterator.hasNext()){
            iterator.getClass();
            System.out.println(number);
        }

        */

        //for(Object next: number){
        //number.add(1,100);
        // System.out.println(number);

        for (int i = 0; i < 0; i++) {
            number.add(1, 100);
            System.out.println(i);
        }
    }
}


