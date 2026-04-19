package com.gla;

class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println(name+" "+id+" "+salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println(teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println(programmingLanguage);
    }
}
class Intern extends Employee{
    int duration;
    Intern(String name,int id,double salary,int duration){
        super(name,id,salary);
        this.duration=duration;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println(duration);
    }
}
class Main6{
    public static void main(String[]args){
        Employee[]arr={new Manager("A",1,50000,5),new Developer("B",2,40000,"Java"),new Intern("C",3,20000,6)};
        for(Employee e:arr)e.displayDetails();
    }
}
