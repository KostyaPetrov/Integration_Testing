package ru.konstantinpetrov.integrationTesting;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import ru.konstantinpetrov.trigonometric.Cosec;
import ru.konstantinpetrov.trigonometric.Sin;


public class CosecTest {
    private Sin mockSin;
    private Cosec cosec;
    

    @BeforeEach
    void setUp(){
        mockSin = Mockito.mock(Sin.class);
        cosec = new Cosec(mockSin);
    }


    @Test
    void testMeansTruth(){
        Mockito.when(mockSin.sineExpansion(5, 10)).thenReturn(-0.958d);
        Mockito.when(mockSin.sineExpansion(-1, 10)).thenReturn(-0.841d);
        
        assertAll(
            () -> assertEquals(-1.043, cosec.cosecExpansion(5, 10), 0.001),
            () -> assertEquals(-1.189, cosec.cosecExpansion(-1, 10), 0.001)
        );
    }


    @Test
    void testMeansFalse(){
        Mockito.when(mockSin.sineExpansion(-1, 10)).thenReturn(0.0d);
        assertNotEquals(0, cosec.cosecExpansion(-1, 10), 0.001);
    }


    @Test
    void testIllegalArgumentException(){
        Mockito.when(mockSin.sineExpansion(0, 10)).thenReturn(0.0d);
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> cosec.cosecExpansion(0, 10));
        assertEquals("x must not be 0", exception.getMessage());
    }


}
