/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayfour;

/**
 *
 * @author jheso
 */
public class MethodsPart2 {
    public static void main(String[] args) {
        int a = 5;
        increment(a);
        System.out.println(a);
        
        int[] arr = {1,2,3,4,5};
        increment(arr);
        System.out.println(arr[0]);
        
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        
        System.out.println("Recursiv method");
        print(1);
    }
    
    public static void increment(int a){
        a = a + 10;
    }
    
    public static void increment(int[] arr){
        arr[0] = 20;
    }
    
    public static int print(int n){
        if (n>=6) {
            return 0;
        }
        System.out.println(n);
        return print(n+2);
    }
    
    
}
