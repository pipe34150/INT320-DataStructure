/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import static hashcode.TestHashFn.hash;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author int320
 */
public class TestHash {

    public static void main(String[] args) {
        int x[] = {1, 9, 15, 32, 7, 18, 9};

        Map<Integer, Integer> setInteger = new TreeMap();

        for (Integer a : x) {
            System.out.println(a + " : " + a.hashCode() + "  -->  " + hash(a.hashCode(), 15)
                    + ", " + +hash(a.hashCode(), 31));
        }
        for (Integer a : x) {
            setInteger.put(a, a);
        }

        Set<Integer> keys = setInteger.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key + " , Value: " + setInteger.get(key));
        }
        
        printpairs(x, 10);

    }

    static void printpairs(int arr[], int sum) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition 
            if (s.contains(temp)) {
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
            }
            System.out.println(arr[i] + " " + temp);
            s.add(arr[i]);
        }
        
        for(Integer x : s){
            System.out.println("Key: " + x + " , Value: " + x);
        }
    }

}
