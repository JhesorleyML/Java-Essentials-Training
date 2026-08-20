/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapecalculator;

/**
 *
 * @author jheso
 */
public class MainClass {
    public static void main(String[] args) {
        Triangle t = new Triangle(12, 10, 5, 5);
        Square s = new Square(8);
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(15, 6);
        
        System.out.println(t);
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: "+ t.getPerimeter());
        System.out.println("-------------------------------");
        
        System.out.println(s);
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println("------------------------------");
        
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Cirumference: "+ c.getCircumference() );
        System.out.println("------------------------------");
        
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("------------------------------");
    }
}
