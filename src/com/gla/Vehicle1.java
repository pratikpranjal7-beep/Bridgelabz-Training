package com.gla;

interface Refuelable{
    void refuel();
}
class Vehicle1{
    int maxSpeed;
    String model;
    Vehicle1(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
}
class ElectricVehicle extends Vehicle{
    ElectricVehicle(int maxSpeed,String model){
        super(maxSpeed,model);
    }
    void charge(){
        System.out.println("Charging");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    PetrolVehicle(int maxSpeed,String model){
        super(maxSpeed,model);
    }
    public void refuel(){
        System.out.println("Refueling");
    }
}
class Main11{
    public static void main(String[]args){
        Refuelable p=new PetrolVehicle(200,"X");
        p.refuel();
    }
}
