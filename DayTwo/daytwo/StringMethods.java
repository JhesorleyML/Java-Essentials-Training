/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daytwo;

import java.util.Scanner;

/**
 *
 * @author jheso
 */
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message:");
        String msg = sc.nextLine();
        
        // cases
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        
        //substring
        System.out.println(msg.substring(0));
        System.out.println(msg.substring(0,5));
        System.out.println(msg.substring(10));
        System.out.println(msg.substring(10,14));
        
        String password = "JavaTraining";
        System.out.print("Enter password:");
        String userPass = sc.next();
        System.out.println(password.equals(userPass));
        System.out.println(password.charAt(0));
        System.out.println(password.equalsIgnoreCase(userPass));
        System.out.println((int)password.toUpperCase().charAt(0));
        
        System.out.println(password.compareTo(userPass));
        System.out.println(password.contains("Java"));
        System.out.println(password.length());
        
    }
}
