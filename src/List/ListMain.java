package List;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(11);
        list.add(7);


        System.out.println(returnBigestNumber(list));

    }

    public static Integer returnBigestNumber(List<Integer> list){
        Integer biggestNumber = list.get(0);
        for (Integer i: list) {
            if (i >= biggestNumber) {
                biggestNumber = i;
            }
        }
        return biggestNumber;
    }
}
