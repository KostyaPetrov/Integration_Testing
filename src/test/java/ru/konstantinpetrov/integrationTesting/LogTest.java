package ru.konstantinpetrov.integrationTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ru.konstantinpetrov.logariphmic.Ln;
import ru.konstantinpetrov.logariphmic.Log;


public class LogTest {

    @Test
    public void logIntegrationTest(){
        float x=5;
        int n=1;
        float base = 10;
        Ln mockLn = Mockito.mock(Ln.class);
        Mockito.when(mockLn.lnExpansion(x, n)).thenReturn(1.63d);
        Mockito.when(mockLn.lnExpansion(base, n)).thenReturn(2.32d);

        Log log = new Log(mockLn);
        double result = log.logExpansion(x, n, base);
        assertEquals(0.702, result, 0.03);

    }
}
