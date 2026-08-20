/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayfour;

import java.util.Scanner;

/**
 *
 * @author jheso
 */
public class FiguresToWords {
    static String[] ones = {"One", "Two", "Three", "Four", "Five",
                            "Six", "Seven", "Eight", "Nine", "Ten"};
    public static void main(String[] args) {
        enterNumber();
        System.out.println("Program terminated!");
    }
    
    public static void enterNumber(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num == 0) {
                return;
            }
            if (num > 10) {
                System.out.println("Number limit");
                continue;
            }
            convertToWords(num);
        } while (true);        
    }

    private static void convertToWords(int num) {
        String inWords = ones[num-1];
        System.out.println(inWords);
    }
}
