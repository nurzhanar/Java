package com.company;

import java.util.Scanner;

class Point2{
    double X2;
    double Y2;
    public void setX2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input X of the first point: ");
        this.X2=in.nextDouble();
    }
    public void setY2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input Y of the first point: ");
        this.Y2=in.nextDouble();
    }
    public double getX(){
        return X2;
    }
    public double getY(){
        return Y2;
    }
}
