package com.week3.creational.designpattern;

abstract class Vehicle{
    public abstract void printVehicleType();
}

class TwoWheeler extends Vehicle{

    @Override
    public void printVehicleType() {
        System.out.println("BIKE");
    }
}

class FourWheeler extends  Vehicle{

    @Override
    public void printVehicleType() {
        System.out.println("CAR");
    }
}

class Client{
    private Vehicle vehicleType;

    public Client(int type){
        if(type ==1){
            vehicleType = new TwoWheeler();
        }else if(type ==2){
            vehicleType = new FourWheeler();
        }else{
            vehicleType = null;
        }
    }
        public void cleanUp(){
        if(vehicleType!=null){
            vehicleType = null;
        }
        }
    public Vehicle getVehicle(){
        return vehicleType;
    }
}


public class FactoryMethod {
    public static void main(String[] args) {
        Client client = new Client(2);
        Vehicle vehicle = client.getVehicle();
        if(vehicle !=null){
            vehicle.printVehicleType();
        }
        client.cleanUp();
    }

}
