/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daythree;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jheso
 */
public class Iteration {
    public static void main(String[] args) {
        double ft = 996847.97;
        
        String curr = String.format("Php %,.2f", ft);
        System.out.println(curr);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        
        int a = 1;
        //while using counter
        while (a <= 100) {
            System.out.println(a);
            a++;
        }
        
        Scanner sc = new Scanner(System.in);
        boolean isWrong = true;
        
        while (isWrong) {
            System.out.println("Enter a letter:");
            String input = sc.next();
            if (input.equalsIgnoreCase("x")) {
                isWrong = false;
                System.out.println("Terminated");
            }
        }
        
        //do while
        a = 6;
        do {
            System.out.println(a++);            
        } while (a <= 5);
        
        
        //for loop
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            if (i % 5 == 0) {
                break;
                //continue;                
            }
            System.out.println("hello");
        }
        
        //11111
        //22222
        //33333
        //44444
        //55555
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        
        System.out.println("End of Method");
    }
}
