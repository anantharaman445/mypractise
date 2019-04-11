import java.util.*;
import java.io.*;
public class AnagramChecker {
    public static void main(String[] args){
        String s1="SILENT";
        String s2="LISTEN";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        boolean anagram = anagramCheck(c1,c2);
        System.out.println("Answer"+" " +anagram);
    }

    static boolean anagramCheck(char[] s1, char[] s2){
        int l1=s1.length;
        int l2= s2.length;
        if(l1 != l2)
            return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<l1;i++){
            if(s1[i] != s2[i])
                return false;
        }

        return true;
    }
}
