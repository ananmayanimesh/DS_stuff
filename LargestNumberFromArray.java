package SelfPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumberFromArray {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("100");
        list.add("11");
        list.add("9");
        list.add("19");

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                String x = o1+o2;
                String y = o2+o1;

                if (Integer.parseInt(x) > Integer.parseInt(y))
                    return -1;
                else if(Integer.parseInt(x) < Integer.parseInt(y))
                    return 1;
                else
                    return 0;
                //return x.compareTo(y)>0?-1:1;
            }
        });


        System.out.println(list.toString());
    }


}
