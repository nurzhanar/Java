package com.company;

abstract class Employee {
        float salary = 40000;
        public abstract void  overall_income();

    }

    class Students extends Employee {
        float scolarship = 25000;
        public void overall_income() {
            System.out.println("Overall income of student is :"+scolarship);
        }
    }

    class ExcellentStudent extends Students {
        float highScholarship = 30000;
    }

    class BadStudent extends Employee {
        float lowScholarship = 22000;
        public void overall_income() {
            System.out.println("Overall income of bad student is :"+lowScholarship);
        }
    }
public class Employeee {
    public static void main(String[] args) {
        Students Nurlan = new Students();
        System.out.println("The salary is: " + Nurlan.salary);
        System.out.println("The scholarship is: " + Nurlan.scolarship);
        ExcellentStudent Madina = new ExcellentStudent();
        BadStudent Madi = new BadStudent();
        System.out.println("The high scholarship is: " + Madina.highScholarship);
        System.out.println("The low scholarship is:" + Madi.lowScholarship);
        Madi.overall_income();
    }
}