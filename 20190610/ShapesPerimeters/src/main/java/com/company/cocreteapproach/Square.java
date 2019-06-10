package com.company.cocreteapproach;

public class Square extends Shape{

    private double side;
   // private double area;
   // private double perimeter;

    public double area() {
        return side * side;
    }
    public double getPerimeter() {
        return  4 * side;
    }
    public double getSide() {
        return side;
    }

}
