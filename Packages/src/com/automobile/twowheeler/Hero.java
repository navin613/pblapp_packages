package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    public int speed;
    public String ownerName;
    public String modelName;
    public String regNo;
    public Hero(String ownerName, String modelName, String regNo, int speed){
        this.modelName = modelName;
        this.ownerName = ownerName;
        this.regNo = regNo;
        this.speed = speed;
    }
    
    @Override
    public String getModelName(){
        return "model name : "+modelName;
    }
    @Override
    public String getRegistrationNumber(){
        return "Registration number : "+regNo;
    }
    @Override
    public String getOwnerName(){
        return "Owner Name : "+ownerName;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void radio(){
        System.out.println("controllig radio device");
    }
}
