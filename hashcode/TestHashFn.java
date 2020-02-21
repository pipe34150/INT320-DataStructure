package hashcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Khaitong
 */
public class TestHashFn {

    public static void main(String[] args) {
        String x[] = {"This", "Ant", "Dog", "Cat", "Bird", "Horse", "Monkey", "Tiger", "Fish", "Camel", "Bear", "Lion"};
        Map<String, String> animal = new HashMap<>();
        
        Set<Entry<String, String>> entrySet = animal.entrySet();

        for (String a : x) {
            System.out.println(a + " : " + a.hashCode() + "  -->  " + hash(a.hashCode(), 15)
                    + ", " + +hash(a.hashCode(), 31));
        }
        for (String a : x) {
            animal.put(a, a);
        }

        Collection<String> values = animal.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("========================");
        Set<Entry<String, String>> entries = animal.entrySet();
        for (Entry<String, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }
        System.out.println("========================");
        Set<String> keys = animal.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + " , Value: " + animal.get(key));
        }

    }

    static int hash(int h, int lastIndexOfTable) {
        int hash = h ^ (h >>> 16);
        return hash & lastIndexOfTable;
    }

}
