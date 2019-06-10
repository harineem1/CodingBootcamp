package com.company.cocreteapproach;

public class Circle extends Shape{

     private double radius;
 //    private double area;
 //    private double perimeter;

     public double area() {
         double cirarea = radius * radius * Math.PI;
         return cirarea;
     }
     public double getPerimeter() {
         double cirperi =  2 * Math.PI * radius;
         return cirperi;
     }
     public double getRadius() {
        return radius;
    }


}
