package SelfPractice;

public class RemoveAdjDupUsingRecursion {
    
    public static void main(String[] args) {
        String s = "geekforgeeks";
        String output = recurse(0, s);
        System.out.println(output);
    }

    private static String recurse(int index,String s) {
        if (index + 1 < s.length()) {

            int next = index;
            if (s.charAt(index) == s.charAt(next + 1)) {
                while ( (next + 1) < s.length() && s.charAt(index) == s.charAt(next + 1) ) {
                    next++;
                }
                return recurse(next, s.substring(0, index) + s.substring(next , s.length()));
            }else
                return recurse(index+1,s);
        }else {
            return s;
        }
    }
}
