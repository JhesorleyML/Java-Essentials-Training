/*
 * Click nbfs://nbhost/SystFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daytwo;

/**
 *
 * @author jheso
 */
public class PrintFormatter {
    public static void main(String[] args) {
        String studentID = "2026-012";
        String name = "Juan dela Cruz";
        String program = "BSIT";
        
        double gradeProg = 89.00;
        double gradeMath = 92.70;
        double gradeEng = 87.00;
        double gradePhy = 90.80;
        
        //printing format
        System.out.println("=========================");
        System.out.println("STUDENT GRADE REPORT");
        System.out.println("=========================");
        System.out.printf("%-15s: %s \n","Student ID", studentID);
        System.out.printf("%-15s: %s \n","Name", name);
        System.out.printf("%-15s: %s \n","Program",program);
                
    }
}
