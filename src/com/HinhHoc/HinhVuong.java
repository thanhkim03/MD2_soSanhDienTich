package com.HinhHoc;

public class HinhVuong implements Resizeable{
    private double a = 2;

    public HinhVuong(double a) {
        this.a = a;
    }

    public HinhVuong() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "diện tích lúc đầu "+a*a;
    }

    @Override
    public double resize(double percent) {
        double b = a+a*percent;
        return b*b;
    }
}
