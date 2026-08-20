/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayfour;

/**
 *
 * @author jheso
 */
public class Methods {
    static String address = "San Jose";
    
    public static void printString(String n, int age){
        System.out.print("Printing Something");
        anotherMethod();
        System.out.println(n);
        System.out.println("I am " + age + " years old");
        
    }
    
    public static void main(String[] args) {
        String name = "John";
        int age = 45;
        printString(name, age);
        System.out.println(address);
        int[] scores = {78,88,90,93};
        int[] scores2 = {100,90,90,93};
        double d = calculateAverage(scores);
        double e = calculateAverage(scores2);
        if (d > 90) {
            System.out.println("With highest honors");
        } else {
            System.out.println("Congratulations");
        }
    }    
    
    public static double calculateAverage(int[] scores){
        double sum = 0.0;
        double average = 0.0;
        for (int score : scores) {
            sum += score;
        }
        average = sum / scores.length;
        System.out.println(average);
        return average;
    }
    
    public static String createInitial(String name){
        String initial = name.substring(0,2);
        return initial;
    }
    
    public static int[] sampleMethodA(){
        int[] arr = {3,2,1};
        return arr;
    }
    
    public static void anotherMethod(){
        System.out.println("...");
    }
}
