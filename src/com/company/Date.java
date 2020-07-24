package com.company;

import java.util.Scanner;

public class Date {
    int year;
    int month;
    int day;

    public Date(int y , int m , int d){
        if (y>=0)
            year = y;
        else year = 2000;
        if (m>0 && m<=12)
            month = m;
        else
            month = 1;
        if (d>0 && d<=30)
            day = d;
        else
            day = 1;
    }


    public int getYear(){
        return year;
    }

    public void setYear(int y){
        if (y>=0)year = y;
        else
            year = 2000;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int m){
        if (m>0 && m<=12)
            month = m;
        else
            month = 1;
    }

    public int getDay(){
        return day;
    }
    public void setDay(int d){
        if (d>0 && d<=30)
            day = d;
            else day = 1;
    }

    public void display(){
        System.out.println(day+"/"+month+"/"+year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        Date date = new Date(year, month, day);
        System.out.print("You Entered :");
        date.display();
    }
}
