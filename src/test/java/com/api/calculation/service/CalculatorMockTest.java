package com.api.calculation.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class CalculatorMockTest {

    @Mock
    CalculatorService calcMock;

    @Spy
    CalculatorService calcSpy;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mockData(){
        calcMock = Mockito.mock(CalculatorService.class);
        Mockito.when(calcMock.sum(Mockito.anyInt(), Mockito.anyInt())).thenReturn(4);
    }

    @Test
    public void mockFixedData(){
        calcMock = Mockito.mock(CalculatorService.class);
        Mockito.when(calcMock.sum(Mockito.eq(2), Mockito.anyInt())).thenReturn(4);
    }

    @Test
    public void MockReturnValuePattern(){
        Mockito.when(calcMock.sum(1,2)).thenReturn(0);
        Mockito.when(calcSpy.sum(1,2)).thenReturn(3);

        System.out.println("Mock " + calcMock.sum(1,2));
        System.out.println("Spy " + calcSpy.sum(1,2));
    }

    @Test
    public void differenceBetweenMockAndSpy(){
        Mockito.when(calcMock.sum(1,2)).thenCallRealMethod();
        Mockito.when(calcSpy.sum(1,2)).thenReturn(3);

        System.out.println("Mock " + calcMock.sum(1,2));
        System.out.println("Spy " + calcSpy.sum(1,2));
    }
    
}
