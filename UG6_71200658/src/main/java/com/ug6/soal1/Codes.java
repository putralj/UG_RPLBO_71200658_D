package com.ug6.soal1;

public class Codes {
    private static String GOODSCODES = "GD";
    private static String VENDINGMACHINESCODE = "VM";
    private static String[] TYPE = {"DR","FD","DG"};

    public String generateGoodsCode(String type, String name){
        int x = name.length();
        char first = name.charAt(0);
        char last = name.charAt(x-1);

        if ()
    }

    public String generateVendingMachinesCode(int order){
        order = 0;
        order++;
        return (String) VENDINGMACHINESCODE + order;

    }
}
