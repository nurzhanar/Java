package com.company;
interface ExcellentStudent{
    public double excellentScholarship=30000;
}
interface BadStudent{
    public double badScholarship=20000;
}
class GoodStudent implements ExcellentStudent,BadStudent{
    public double scholarship=(excellentScholarship+badScholarship)/2;
}
public class Students {
    public static void main(String[] args) {
	GoodStudent Darina=new GoodStudent();
	System.out.print(Darina.scholarship);
    }
}
