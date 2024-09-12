package ru.konstantinpetrov.integrationTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ru.konstantinpetrov.function.Calculate;
import ru.konstantinpetrov.logariphmic.Log;
import ru.konstantinpetrov.trigonometric.Cosec;
import ru.konstantinpetrov.trigonometric.Sin;

public class CalculateTest {

    private Cosec mockCosec;
    private Log mockLog;
    private Sin mockSin;
    Calculate calculate;

    @BeforeEach
    void setUp(){
        mockCosec = Mockito.mock(Cosec.class);
        mockLog = Mockito.mock(Log.class);
        mockSin = Mockito.mock(Sin.class);
        calculate = new Calculate(mockSin, mockCosec, mockLog);
    }


    @Test
    void testCalulateTruth(){
        // float x=5;
        // int n=1;
        // float base = 10;
        


        // Cosec mockCosec = Mockito.mock(Cosec.class);
        // Log mockLog = Mockito.mock(Log.class);
        // Sin mockSin = Mockito.mock(Sin.class);

        Mockito.when(mockSin.sineExpansion(-1, 10)).thenReturn(-0.841d);
        Mockito.when(mockCosec.cosecExpansion(-1, 10)).thenReturn(-1.189d);
        Mockito.when(mockLog.logExpansion(5, 1, 10)).thenReturn(0.710d);
        Mockito.when(mockLog.logExpansion(5, 1, 5)).thenReturn(1.0d);
        Mockito.when(mockLog.logExpansion(5, 1, 2)).thenReturn(2.458d);

        // Calculate calculate = new Calculate(mockSin, mockCosec, mockLog);
        // double result = calculate.calc(x, n);
        assertEquals(-2.03, calculate.calc(-1, 10), 0.03);
        assertEquals(6.04, calculate.calc(5, 1), 0.03);

    }

    @Test
    void testCalulateFalse(){
        Mockito.when(mockSin.sineExpansion(-1, 10)).thenReturn(-0.841d);
        Mockito.when(mockCosec.cosecExpansion(-1, 10)).thenReturn(-1.189d);
        Mockito.when(mockLog.logExpansion(5, 1, 10)).thenReturn(0.710d);
        Mockito.when(mockLog.logExpansion(5, 1, 5)).thenReturn(1.0d);
        Mockito.when(mockLog.logExpansion(5, 1, 2)).thenReturn(2.458d);

        assertNotEquals(5, calculate.calc(-1, 10), 0.03);
        assertNotEquals(2, calculate.calc(5, 1), 0.03);
    }
}
