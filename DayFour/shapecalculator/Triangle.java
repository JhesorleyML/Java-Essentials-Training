/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapecalculator;

/**
 *
 * @author jheso
 */
public class Triangle implements IShape{
    private double height;
    private double base;
    private double sideX;
    private double sideY;

    public Triangle(double height, double base, double sideX, double sideY) {
        this.height = height;
        this.base = base;
        this.sideX = sideX;
        this.sideY = sideY;
    }
    
    public double getPerimeter() {
        return this.base + this.sideX + this.sideY;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" + "height=" + height + ", base=" + base + ", sideX=" + sideX + ", sideY=" + sideY + "}";
    }
    
}
