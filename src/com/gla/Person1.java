package com.gla;

interface Worker{
    void performDuties();
}
class Person1{
    String name;
    int id;
    Person1(String name,int id){
        this.name=name;
        this.id=id;
    }
}
class Chef extends Person implements Worker{
    Chef(String name,int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Cooking");
    }
}
class Waiter extends Person implements Worker{
    Waiter(String name,int id){
        super(name,id);
    }
    public void performDuties(){
        System.out.println("Serving");
    }
}
class Main9{
    public static void main(String[]args){
        Worker w=new Chef("A",1);
        w.performDuties();
    }
}
