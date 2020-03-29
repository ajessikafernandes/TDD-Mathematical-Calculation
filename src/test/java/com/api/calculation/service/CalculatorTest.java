package com.api.calculation.service;

import com.api.calculation.exceptions.NullCannotBeUsedInThisOperation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    int result;

    CalculatorService calculator;

    @Before
    public void setup(){
        calculator = new CalculatorService();
    }

    @Test
    public void sum (){
        int a = 5;
        int b = 3;
        result = calculator.sum(a, b);
        assertEquals(8, result);
    }

    @Test
    public void subtract (){
        int a = 5;
        int b = 3;
        result = calculator.subtract(a, b);
        assertEquals(2, result);
    }

    @Test
    public void multiply (){
        int a = 5;
        int b = 3;
        result = calculator.multiply(a, b);
        assertEquals(15, result);
    }

    @Test
    public void share (){
        int a = 5;
        int b = 3;
        result = calculator.share(a, b);
        assertEquals(1, result);
    }

    @Test(expected = NullCannotBeUsedInThisOperation.class)
    public void valueNotAccepted(){
            int a = 6;
            int b = 0;
            calculator.share(a, b);
    }

}
