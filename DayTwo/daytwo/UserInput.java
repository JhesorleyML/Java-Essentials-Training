/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daytwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author jheso
 */
public class UserInput {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit:");
        int s = sc.nextInt();
        
        System.out.println(s + 3);
        
        String num = sc.next();
        int n = Integer.parseInt(num);
        System.out.println(n + 3);
        
        //JOptionPane
        String greet = JOptionPane.showInputDialog("Enter Greetings");
        
        //Buffered Reader
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        
        System.out.println("Enter your name: ");
        try {
            String name = br.readLine();
            System.out.println(greet + " " + name);
        } catch (IOException e) {
            System.err.println(e);
        }
        
              
        
        
        
    }
}
