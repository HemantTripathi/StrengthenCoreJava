package com.hemant.core.generics;

public class MainStoreMultiType {
    public static void main(String[] args) {
        var storeMultiType = new StoreMultiType<Integer,String>(23,"Hello");
        System.out.println(storeMultiType.getVal1());
        System.out.println(storeMultiType.getVal2());


    }
}
