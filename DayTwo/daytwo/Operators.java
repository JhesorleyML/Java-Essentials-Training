/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daytwo;

/**
 *
 * @author jheso
 */
public class Operators {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = a + b;
        
        double d = 5.13;
        int ans = a + (int) d;
        System.out.printf("%d + %d = %d\n", a, b, c);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d %% %d = %d\n", a, b, a%b);
        
        System.out.printf("%d + %f = %f\n", a, d, a+d);
        
        double ans2 = a * d;
        
        //unary increment
        
        System.out.println(++a);
        System.out.println(a);        
        
        //compound assignment
        a /= 3;
        System.out.println(a);
        
        System.out.println(!(a > b));
        
        //conditional
        boolean b1 = true;
        boolean b2 = false;
        boolean res = a<b && b == 5;
        
        int f = 45;
        int g = 30;
        
        boolean res2 = b1 || a>b ; 
        System.out.println(res2);
        
        int h = 5;
        System.out.println(h>>2);
        
        System.out.println(a); //a = 2
        
        int j = (a + b) / 5 * 4;
        
    }
}
