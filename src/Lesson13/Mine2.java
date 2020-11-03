package Lesson13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Mine2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add (34);
        numbers.add(22);
        numbers.add(8);

        // первый способ - с помощью стандартного цикла for
        for (int i=0; i <numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        // второй способ: for each
        for(Integer num : numbers){
            System.out.println(num);
        }
        // третий способ - с помощью итератора
        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }

    }
}
