/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author int320
 */
public class TestRecursion {
    public static void main(String[] args) {
        int sum = s(10);
        System.out.println("S(10) = " + sum);
        long sumf = fact(5);
        System.out.println("fact(5) = " + sumf);
        
    }
    
    private static long fact(int n){
        if(n == 1){
            return 1;
        } return fact(n-1) * n;
    }
    
    private static int s(int n){
        if(n == 1){
            return 1;
        } return s(n-1) +n;
    }
}
