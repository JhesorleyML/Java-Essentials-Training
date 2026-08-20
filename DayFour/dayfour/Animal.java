/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dayfour;

/**
 *
 * @author jheso
 */
public class Animal {
    //fields or props
    private String type;
    private String  food;
    private double height;
    private double weight;
    
    private static int count = 0;
    
    //default constructor
    public Animal(){
        count += 1;
    }
    
    //constructor overloading
    //parameterized
    public Animal(String t){
        type = t;
        count += 1;
    }

    public Animal(String type, double height, double weight) {
        this.type = type;
        this.height = height;
        this.weight = weight;
        count += 1;
    }

    public Animal(String type, String food, double height, double weight) {
        this.type = type;
        this.food = food;
        this.height = height;
        this.weight = weight;
        count += 1;
    }
    
    public static int getCount(){
        return count;
    }
    
    //methods
    public void eat(String food){
        System.out.println("Eating.." + food);
        calculateWeight();
    }
    
    private void calculateWeight(){
        this.weight += 1;
    }
    
    //setter
    public void setType(String type){
        this.type = type;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //getter

    public String getType() {
        return type;
    }

    public String getFood() {
        return food;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    

    
    
    
    
    
}
