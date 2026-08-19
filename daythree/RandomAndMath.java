/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daythree;

import java.util.Random;

/**
 *
 * @author jheso
 */
public class RandomAndMath {
    public static void main(String[] args) {
        //Random class
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
        
        number = random.nextInt(20);
        System.out.println(number);
        
        double d = random.nextDouble();
        System.out.println(d*10);
        
        //math methods
        double r = random.nextDouble() * 10;
        double area = Math.PI * Math.pow(r,2);
        System.out.printf("Area: %.4f \n", area);
        
        int n = -5;
        System.out.println(Math.abs(n)); //5
        
        double m = 5.3456;
        System.out.println("Ceil: " + Math.ceil(m));
        System.out.println("Floor: " + Math.floor(m));
        
        
    }
}
