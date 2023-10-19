package Homework;


public class Main {
    public static void main(String[] args) {
       // Employee emp=new Employee(100,"Gunel","ALiyeva",1000);
        Employee[] emp=new Employee[2];
        emp[0]=new Employee(100,"Gunel","Aliyeva",1000);
        System.out.println(emp[0].toString());
        emp[0].work();
        System.out.println(emp[0].getSalary());
        HRManager hr =new HRManager(200,"Arifa","Mammadzada",2000," Manager");
        System.out.println(hr.toString());
        hr.work();


    }
}