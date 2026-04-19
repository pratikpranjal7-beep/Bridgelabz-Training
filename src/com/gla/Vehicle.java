package com.gla;

class Vehicle{
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println(maxSpeed+" "+fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println(seatCapacity);
    }
}
class Truck extends Vehicle{
    int loadCapacity;
    Truck(int maxSpeed,String fuelType,int loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println(loadCapacity);
    }
}
class Motorcycle extends Vehicle{
    boolean hasABS;
    Motorcycle(int maxSpeed,String fuelType,boolean hasABS){
        super(maxSpeed,fuelType);
        this.hasABS=hasABS;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println(hasABS);
    }
}
class Main10{
    public static void main(String[]args){
        Vehicle[]arr={new Car(200,"Petrol",5),new Truck(120,"Diesel",10),new Motorcycle(180,"Petrol",true)};
        for(Vehicle v:arr)v.displayInfo();
    }
}
