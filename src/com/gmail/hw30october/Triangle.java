package com.gmail.hw30october;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    public double length (Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    @Override
    public double getPerimetr() {
        return length(a,b) + length(b,c) + length (c,a);
    }
    @Override
    public double getArea() {
        double p = getPerimetr()/2;
        return Math.sqrt(p*(p-length(a,b)) * (p - length(b,c)) * (p - length(c,a)));
    }
}
