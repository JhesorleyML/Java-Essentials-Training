/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapecalculator;

/**
 *
 * @author jheso
 */
public class Rectangle implements IShape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }  

    public Rectangle(double length) {
        this.length = length;
        width = length;
    }
    
    
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    
    
}
