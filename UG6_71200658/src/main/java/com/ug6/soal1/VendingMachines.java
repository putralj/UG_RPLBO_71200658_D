package com.ug6.soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachines {
    private String code;
    private int capacity, usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    Scanner p = new Scanner(System.in);

    public VendingMachines() {}

    public VendingMachines(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;


    }

    public VendingMachines(String code, int capacity, ArrayList<Goods> goods, ArrayList<Double> acceptanceBalance) {
        this.code = code;
        this.capacity = capacity;
        this.goods = goods;
        this.acceptanceBalance = acceptanceBalance;
    }


    public void proceedOrder(String goodsCode, int orderQuality){}

    public void takeMoney(double money){

    }

    private void giveGood(double goodsPrice, String goodsName){}

    public double withdrawMoney(){}

    public void inputGoods(Goods good){}
}
