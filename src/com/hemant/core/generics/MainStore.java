package com.hemant.core.generics;

public class MainStore {
    public static void main(String[] args) {
        var value = new Store<String>("Hello Generics");
        System.out.println(value.getValue());


    }

}
