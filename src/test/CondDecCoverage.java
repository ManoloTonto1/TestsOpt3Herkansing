package test;
import static org.junit.Assert.*;

import org.junit.Test;

import app.Vlucht;

public class CondDecCoverage {
    static Vlucht vlucht = new Vlucht();


    @Test
    public void magOpstijgen_expectTrue(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(900, 60,true);

        //assert
        assertTrue(result);
    }

    @Test
    public void magOpstijgen_expectFalse(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(1100, 20,false);

        //assert
        assertFalse(result);
    }
    
}
