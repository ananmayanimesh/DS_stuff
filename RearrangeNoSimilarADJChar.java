package SelfPractice;

import com.sun.istack.internal.NotNull;

import java.util.HashMap;
import java.util.Map;

public class RearrangeNoSimilarADJChar {


    public static void main(String[] args) {
        String s = "hello";
        compute(s);
    }

    private static void compute(String s) {



    }

    public static Map<Character,Integer> freq(String s){
        Map<Character,Integer> map = new HashMap<>();
        for (char c:s.toCharArray() ){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        return map;
    }


}
