package com.company;

interface Employee{
    public void getOverallIncome();
    public void getJobStartDate();
}
class Student implements Employee{
    public void getOverallIncome(){
        System.out.println("Overall income 35000");

    }

    public void getJobStartDate(){
        System.out.println("start date 15.02.2012");
    }
}
public class Main {

    public static void main(String[] args) {
	Student Darina=new Student();
	Darina.getJobStartDate();
	Darina.getOverallIncome();
    }
}
