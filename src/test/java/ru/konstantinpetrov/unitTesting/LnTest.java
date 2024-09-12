package ru.konstantinpetrov.unitTesting;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.konstantinpetrov.logariphmic.Ln;

public class LnTest {
    private Ln ln;

    @BeforeEach
    void setUp(){
        ln=new Ln();
    }

    @Test
    void testLnExpansionTruth(){
        assertAll(
                () -> assertEquals(1.1922402381896973, ln.lnExpansion(5,10))
        );
    }

    @Test
    void testLnExpansionFalse(){
        assertAll(
                () -> assertNotEquals(1, ln.lnExpansion(5,10))
        );
    }

    @Test
    void getFact(){
        assertAll(
                () -> assertEquals(3628800, ln.getFact(10))
        );
    }
}
