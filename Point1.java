package com.company;

import java.util.Scanner;

class Point1{
    double X1;
    double Y1;
    public void setX1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input X of the first point: ");
        this.X1=in.nextDouble();
    }
    public void setY1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input Y of the first point: ");
        this.Y1=in.nextDouble();
    }
    public double getX1(){
        return X1;
    }
    public double getY1(){
        return Y1;
    }
}
