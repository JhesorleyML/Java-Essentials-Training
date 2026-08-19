/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daythree;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jheso
 */
public class ArrayClass {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] grades = new int[SIZE];
//        System.out.println(grades.length);
        //0, null, false
        grades[0] = 90;
        grades[4] = 88;        
        Scanner sc = new Scanner(System.in);
//        grades[pos-1] = g;

        for (int index = 0; index < SIZE; index++) {
            System.out.print("Enter grade: ");
            int g = sc.nextInt();
            grades[index] = g;
        }
        double sum = 0; 
        int max = grades[0];
        int min = grades[0];
        
        for (int grade : grades) {
            System.out.print(grade + " ");
            sum += grade;
            if (grade > max) 
                max = grade;
                      
            if (grade < min) 
                min = grade;
            
        }
        double average = sum / SIZE;
        System.out.printf("\nAverage: %.2f\n", average);
        System.out.printf("Max grade: %d\n", max);
        System.out.printf("Min grade: %d\n", min);
        
        Arrays.sort(grades);
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        
        int median = grades.length /2 ;
        
        if (grades.length % 2 == 0) {
            //if lenght = even
            int medGrade = ((grades[median] + 
                    grades[median-1])/2);
            System.out.printf("Median:", medGrade );
        } else {
            System.out.println("Median: " + grades[median]);
        }
        
    }
}
