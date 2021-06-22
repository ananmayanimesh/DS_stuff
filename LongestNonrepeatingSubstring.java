package SelfPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestNonrepeatingSubstring {

    public static void main(String[] args) {
        String s= "hello";
        longestSubstring(s);
    }

//    static void longestSubstring(String inputString)
//    {
//        //Convert inputString to charArray
//
//        char[] charArray = inputString.toCharArray();
//
//        //Initialization
//
//        String longestSubstring = null;
//
//        int longestSubstringLength = 0;
//
//        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
//
//        for (int i = 0; i < charArray.length; i++) {
//
//            if (!charPosMap.containsKey(inputString.charAt(i))){
//                charPosMap.put(inputString.charAt(i),i);
//            }else {
//                i=charPosMap.get(inputString.charAt(i));
//                charPosMap.clear();
//            }
//            if (longestSubstringLength < charPosMap.size()){
//                longestSubstring=charPosMap.keySet().toString();
//                longestSubstringLength=charPosMap.size();
//            }
//        }
//        System.out.println("Input String : "+inputString);
//
//        System.out.println("The longest substring : "+longestSubstring);
//
//        System.out.println("The longest Substring Length : "+longestSubstringLength);
//    }

    static String longestSubstring(String s){

        if (s.length()<2)
            return s;
        else {
            int length=0;
            String subString = "",longest="";
            Map<Character,Integer> map= new LinkedHashMap();
            for (int i=0;i<s.length()-1;i++){

                if (!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),i);
                }
                else {
                    if (map.size()>length) {
                        longest = map.keySet().toString();
                        length = map.size();
                    }
                    i=map.get(s.charAt(i))+1;
                }
            }
            System.out.println(longest+length);
            return longest;
        }


    }

}
