package com.api.calculation.service;

import com.api.calculation.exceptions.NullCannotBeUsedInThisOperation;

public class CalculatorService {

    int result;

    public int sum (int a, int b){
        return result = a + b;
    }

    public int subtract (int a, int b){
        return result = a - b;
    }

    public int multiply (int a, int b){
        return result = a * b;
    }

    public int share (int a, int b){
        notZero(a, b);
        return result = a / b;
    }

    public void notZero(int a, int b){
        if( a == 0 || b == 0){
            throw new NullCannotBeUsedInThisOperation("Value not accepted");
        }
    }

}
