package com.company.cocreteapproach;

public class Triangle extends Shape{
    private Double sideA, sideB, sideC;
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    public double area() {
        double p = perimeter() / 2;

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p-sideC));
    }

}
