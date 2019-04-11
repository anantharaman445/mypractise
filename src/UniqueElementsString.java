import java.io.*;
import java.util.*;
public class UniqueElementsString {
    public static boolean determineUniqueString(String s) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;

        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        boolean unique = determineUniqueString(s);
       System.out.println(unique);
    }


}
