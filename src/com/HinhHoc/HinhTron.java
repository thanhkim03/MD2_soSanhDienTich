package com.HinhHoc;

public class HinhTron implements Resizeable {
    public double radius = 1.0;

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "diện tích : "+this.radius*this.radius* Math.PI;
    }

    @Override
    public double resize(double percent) {
        double r = this.radius + this.radius*percent;
        return r*r* Math.PI;
    }
}
