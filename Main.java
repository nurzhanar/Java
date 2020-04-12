package com.company;
import java. lang. Math;

class Main{
    public static void main(String[] args){
        Point1 Point1=new Point1();
        Point2 Point2=new Point2();
        Point1.setX1();
        Point1.setY1();
        Point2.setX2();
        Point2.setY2();

        double distance = Math. sqrt((Point1.X1-Point2.X2)*(Point1.X1-Point2.X2)+(Point1.Y1-Point2.Y2)*(Point1.Y1-Point2.Y2));
        System. out. print(distance);
    }
}


