package com.company;

public class Date {
    public int month;
    public int day;
    public int year;
    public Date(int some_month, int some_day, int some_year){
        this.month=some_month;
        this.day=some_day;
        this.year=some_year;
    }
    public void setMonth(int Month){
        this.month = Month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int Day){
        this.day=Day;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int Year){
        this.year=Year;
    }
    public int getYear(){
        return year;
    }
    public void displayDate(int month,int day,int year){
        if (day<=31 && (month==1|| month==3 || month==5 || month==7 || month==8 || month==12 )){
            System.out.println(month + "/" + day + "/" + year);
        }
        else if (day<=30 && (month==4 || month==6 || month==9 || month==10 || month==11 )){
            System.out.println(month + "/" + day + "/" + year);
        }
        else if (month==2){
            if((year%4==0 && year%100!=0) || year%400==0 && day<=29){
                System.out.println(month + "/" + day + "/" + year);
            }
            else if (day<=28){
                System.out.println(month + "/" + day + "/" + year);
            }
            else{
                System.out.println("This day is incorrect" );
            }
        }
        else{
            System.out.println("This day is incorrect" );
        }
    }
}
