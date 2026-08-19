/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daythree;

import java.util.Scanner;

/**
 *
 * @author jheso
 */
public class SelectionPart2 {
    public static void main(String[] args) {
        //grade = A; => Excellent
        //grade = B => Good
        //gade = C => Satisfactory
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade [A,B,C]:");
        char input = sc.next().charAt(0);
        switch (input) {
            case 'A':case 'a':
                System.out.println("Excellent");
                //more code here
                break;
            case 'B': case 'b':
                System.out.println("Good");
                break;
            case 'C': case 'c':
                System.out.println("Satisfactory");
                break;
            default:
                System.out.println("Invalid input");
        }
        
    }
}
