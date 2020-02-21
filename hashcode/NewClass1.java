/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author int320
 */
public class NewClass1 {

    public static void main(String[] args) {
        Set<Integer> a = new HashSet();
        a.add(5);
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(10);
        a.add(10);
        a.add(2);
        a.add(10);
        System.out.println(a.add(10));
        for (Integer integer : a) {
            System.out.println(integer);
        }

    }
}
