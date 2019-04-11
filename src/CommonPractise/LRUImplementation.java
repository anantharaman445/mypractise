package CommonPractise;
import java.io.*;
import java.util.*;
public class LRUImplementation {
    static  Deque<Integer> dq;
    static HashSet<Integer> hs;
    static int csize ;
    LRUImplementation(int n){
        dq = new LinkedList<>();
        hs = new HashSet<>();
        csize = n;
    }

    public void queueManipulation(int x){
        if(!hs.contains(x))
        {
            if(dq.size() == csize){
               int last = dq.removeLast();
               hs.remove(last);
            }
        }else{
            int index = 0, i=0;
            Iterator<Integer> iterator = dq.iterator();
            while(iterator.hasNext()){
                if(iterator.next() == x){
                    index = i;
                }
                i++;

            }
            dq.remove(index);

        }
        dq.push(x);
        hs.add(x);
    }

    public void display()
    {
        Iterator<Integer> itr = dq.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
    public static void main(String[] args) {
        LRUImplementation ca=new LRUImplementation(4);
        ca.queueManipulation(1);
        ca.queueManipulation(2);
        ca.queueManipulation(3);
        ca.queueManipulation(1);
        ca.queueManipulation(4);
        ca.queueManipulation(5);
        ca.display();
    }
}
