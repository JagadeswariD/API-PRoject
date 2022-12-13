package com.abstraction.example;

public class PolymorphismExample {
public static void main(String[] args) {
        
        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle1 c1 = new Circle1();
        c1.render();
        
        Polygon p1 = new Polygon();
        p1.render();
        
      }
}
