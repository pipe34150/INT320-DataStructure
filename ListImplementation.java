package listimplementation;

import java.util.ArrayList;
import java.util.LinkedList;
public class ListImplementation {
    public static void main(String[] args) {
        long begin;
        long end;
        
        ArrayList<Integer> aryl = new ArrayList<>(100000);
        LinkedList<Integer> lnkl = new LinkedList<>();
        
        for(int i = 0 ; i < 100000  ; i++){
            int temp = (int) (Math.random()*100);
            aryl.add(temp);
            lnkl.add(temp);
        }
        System.out.println("Current Size : " + aryl.size());
        
        begin = System.currentTimeMillis();
        aryl.removeIf(x -> (x < 50));
        end = System.currentTimeMillis();
        System.out.println("ARRAYLIST : " + (end-begin) + "ms");
        
        begin = System.currentTimeMillis();
        
        lnkl.removeIf(x -> (x < 50));
        end = System.currentTimeMillis();
        System.out.println("LINKEDLIST : " + (end-begin) + "ms");
        
        System.out.println("Current Size : " + aryl.size());
    }
}
