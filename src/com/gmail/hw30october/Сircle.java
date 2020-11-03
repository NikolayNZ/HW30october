package com.gmail.hw30october;

public class Сircle extends Shape{
    private Point m; //цент (midpoint)
    private Point r;

    public Сircle(Point m, Point r) {
        this.m = m;
        this.r = r;
    }

    public Сircle() {
        super();
    }

    public Point getM() {
        return m;
    }

    public void setM(Point m) {
        this.m = m;
    }

    public Point getR() {
        return r;
    }

    public void setR(Point r) {
        this.r = r;
    }

    public double radius (Point r, Point m) {
        return Math.sqrt(Math.pow(r.getX() - m.getY(), 2) + Math.pow(r.getY() - m.getY(), 2));
    }

    @Override
    double getPerimetr() {
        double p = 2 * Math.PI * radius(r,m);
        return p;
    }

    @Override
    double getArea() {
        double area = Math.PI * (Math.sqrt (radius(r,m)));
        return area;
    }

    @Override
    public String toString() {
        return "Сircle{" + "m=" + m + ", r=" + r + '}';
    }
}

