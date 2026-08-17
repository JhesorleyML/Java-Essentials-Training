/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variablesanddatatypes;

/**
 *
 * @author jheso
 */
public class DayOneDemo2 {
    public static void main(String[] args) {
        int i = 100;
        byte b = 127;
        short s = 1000;
        long l = 54L;
        
        float f = 45.6F;
        double d = 13.43567;
        
        int bin_num = 0b10010111;
        int oct_num = 054;
        int hex_num = 0x35AF;
        
        char c = 'A';
        boolean isValid = false;
        short num = (short)i; //narrowing
        i = b; // widening
        
        System.out.println(i);
        System.out.println(num);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(isValid);
    }
}
