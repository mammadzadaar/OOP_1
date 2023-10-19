package Homework;

import java.text.SimpleDateFormat;
import java.util.Objects;

public class Employee {
    int id;
    String name;
    String surname;
    int salary;
   // String work = "Manage data objects";


public Employee(){

}
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Employee(int id, String name, String surname) {
        this(id, name);
        this.surname = surname;
    }

    public  Employee(int id,String name,String surname,int salary) {
        this(id,name,surname);
        this.salary=salary;
    }

    public String toString() {
        return "{Id= " + id + ", Name= " + name + ", Surname= " + surname;
    }


    public void work() {
        System.out.println("Develops bank products");


    }

    public int getSalary() {
        return salary;
    }
}
