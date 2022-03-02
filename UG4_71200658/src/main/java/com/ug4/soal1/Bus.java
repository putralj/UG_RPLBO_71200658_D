package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    String name
    String[] route = {"kampus ukdw","asrama omah babadan","asrama teologi"};
    Driver driver;
    int CAPACITY, usedCapacity;
    final ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    Double profit, fares;
    final Double fares;


    String getName(){
        return name;
    }
    String[] getRoute(){
        
    }
    /*String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getROUTE(String ROUTE) {
        return ROUTE;
    }

    int getUsedCapacity(int usedCapacity) {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    Double getProfit(Double profit) {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    final Double getFares(final Double fares) {
        return fares;
    }

    final ArrayList<Passenger> getPassengers(final ArrayList<Passenger> passengers) {
        return passengers;
    }

    Driver getDriver(Driver driver) {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void Boolean checkPassengerBalance(Passenger passenger) {
        if (passenger.balance < fares) {

        }
    }*/
}


