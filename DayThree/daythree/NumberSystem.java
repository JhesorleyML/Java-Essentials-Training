/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daythree;

/**
 *
 * @author jheso
 */
public class NumberSystem {
    public static void main(String[] args) {
        int bn = 0b100011;
        System.out.println(bn);
        
        int hn = 0x23;
        System.out.println(hn);
        
        int on = 043;
        System.out.println(on);
        
        int dc = 725;
        System.out.println(Integer.toBinaryString(dc));
        System.out.println(Integer.toOctalString(dc));
        System.out.println(Integer.toHexString(dc));
        System.out.println(Integer.toBinaryString(bn));
        
    }
}
