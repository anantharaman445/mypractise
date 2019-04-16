package CommonPractise;
import java.util.*;
import java.io.*;
public class SamplePractise {
   static Deque<Integer> deque;
    static  HashSet<Integer> hashSet;
    static int csize;

    SamplePractise(int n){
        deque = new LinkedList<>();
        hashSet = new HashSet<>();
        csize = n;
    }

    public void traverseCache(int x){
        if(!hashSet.contains(x)){
            if(csize == deque.size()){
                int last = deque.removeLast();
                hashSet.remove(deque);
            }
        }else{
            int index = 0,i=0;
            Iterator<Integer> iterator = deque.iterator();
            while (iterator.hasNext()){
                if(iterator.next() == x)
                    index = i;

                i++;
            }
            deque.remove(index);

        }
        deque.push(x);
        hashSet.add(x);
    }
}
