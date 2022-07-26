package com.hemant.core.generics;

public class StoreMultiType<U,V> {

    U val1;
    V val2;

    public StoreMultiType(U val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public U getVal1() {
        return val1;
    }

    public void setVal1(U val1) {
        this.val1 = val1;
    }

    public V getVal2() {
        return val2;
    }

    public void setVal2(V val2) {
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "StoreMultiType{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}
