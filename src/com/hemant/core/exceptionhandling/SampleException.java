package com.hemant.core.exceptionhandling;

public class SampleException {

    private void doStuff(){
        doMoreStuff();
        System.out.println("Inside doStuff()");
    }

    private void doMoreStuff(){
        System.out.println("Inside doMoreStuff()");
    }

    public static void main(String[] args) {
        SampleException sampleException = new SampleException();
        sampleException.doStuff();
        System.out.println(10/0);
    }
}
