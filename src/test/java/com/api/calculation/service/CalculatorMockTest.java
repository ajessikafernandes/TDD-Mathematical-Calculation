package com.api.calculation.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

public class CalculatorMockTest {

    @InjectMocks
    CalculatorService calculator;

    @Test
    public void mockData(){
        calculator = Mockito.mock(CalculatorService.class);
        Mockito.when(calculator.sum(Mockito.anyInt(), Mockito.anyInt())).thenReturn(4);
    }

    @Test
    public void mockFixedData(){
        calculator = Mockito.mock(CalculatorService.class);
        Mockito.when(calculator.sum(Mockito.eq(2), Mockito.anyInt())).thenReturn(4);
    }
}
