package com.api.calculation.service;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorMockTest {

    @Test
    public void mockData(){
        CalculatorService calculator = Mockito.mock(CalculatorService.class);
        Mockito.when(calculator.sum(Mockito.anyInt(), Mockito.anyInt())).thenReturn(4);
    }

    @Test
    public void mockFixedData(){
        CalculatorService calculator = Mockito.mock(CalculatorService.class);
        Mockito.when(calculator.sum(Mockito.eq(2), Mockito.anyInt())).thenReturn(4);
    }
}
