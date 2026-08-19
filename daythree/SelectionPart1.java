/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daythree;

/**
 *
 * @author jheso
 */
public class SelectionPart1 {
    public static void main(String[] args) {
        int grade = 85;
        
        //passed grade = 75-100
        //failed grade = 0-74
        // above 100 => error
        // below 0 => error
        
        //grade 90 - 100 => A
        //grade 80 - 89  => B
        //grade 75 - 79 => C
        //grade below 75 = F
        //Invalid grade => less than 0 & > 100
        
        //nested if
        if (grade <= 75 && grade >= 100) {
            System.out.println("Passed");
            if (grade >= 90 && grade <= 100) {
            System.out.println("A");
            } else if(grade >= 80 && grade <= 89){
                System.out.println("B");
            } else if(grade >= 75 && grade <= 79){
                System.out.println("C");
            }
        } else if(grade >= 0 && grade < 75){
            System.out.println("Failed");
            System.out.println("F");
        } else{
            System.out.println("Invalid grade");
        }
        //----------------------------------------
        
        
        //not nested
        if (grade <= 75 && grade >= 100) {
            System.out.println("Passed");            
        } else if(grade >= 0 && grade < 75){
            System.out.println("Failed");
        } 
        
        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 75 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 0 && grade < 75) {
            System.out.println("F");
        } else {
            System.out.println("Invalid grade");
        }
        
        
        
        
        
   
        
    }
}
