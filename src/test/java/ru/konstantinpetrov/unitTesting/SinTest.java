package ru.konstantinpetrov.unitTesting;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.konstantinpetrov.trigonometric.Sin;

public class SinTest {
    private Sin sin;

    @BeforeEach
    void setUp(){
        sin=new Sin();
    }

    @Test
    void testSineExpansionTruth(){
        assertAll(
                () -> assertEquals(-0.95, sin.sineExpansion(5,10),0.01),
                () -> assertEquals(-0.14, sin.sineExpansion(-3,10),0.01),
                () -> assertEquals(0.0, sin.sineExpansion(0,10),0.01)
        );
    }

    @Test
    void testSineExpansionFalse(){
        assertAll(
                () -> assertNotEquals(1, sin.sineExpansion(5,10))
        );
    }

    

    

    @Test
    void testGetFact(){
        assertEquals(3628800, sin.getFact(10));
        
    }
}
