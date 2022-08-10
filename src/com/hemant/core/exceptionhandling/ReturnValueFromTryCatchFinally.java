package com.hemant.core.exceptionhandling;

public class ReturnValueFromTryCatchFinally {
    public static void main(String[] args)
    {
        System.out.println("Value returned:"+methodReturningValue());
    }
    static int methodReturningValue()
    {
        try
        {
            System.out.println("value of i:"+Integer.parseInt("abc"));
            return 20;
        }
        finally
        {
            return 50;
        }
    }
}
