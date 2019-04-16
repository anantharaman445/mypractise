import java.io.*;
import java.util.*;

public class Exponential {
    public static int getExponentValue(int x,int n, int constant){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n > 1){
            x=x*constant;
            n--;
        }
        return getExponentValue(x,n,constant);
    }
    public static void main(String[] args){
        System.out.println(getExponentValue(4,3,4));
    }

}
