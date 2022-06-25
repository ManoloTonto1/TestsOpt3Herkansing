package test;
import static org.junit.Assert.*;

import org.junit.Test;

import app.Vlucht;

public class ModCondDecCoverage {
    static Vlucht vlucht = new Vlucht();

    @Test
    public void magOpstijgen_SecondParamFalse_expectTrue(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(900, 49,true);

        //assert
        assertTrue(result);
    }
    @Test
    public void magOpstijgen_FirstParamFalse_expectTrue(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(1001, 51,true);

        //assert
        assertTrue(result);
    }
    @Test
    public void magOpstijgen_AllParamTrue_expectTrue(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(999, 51,true);

        //assert
        assertTrue(result);
    }

    
    @Test
    public void magOpstijgen_FirstParamTrue_expectFalse(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(1200, 48,false);

        //assert
        assertFalse(result);
    }
    @Test
    public void magOpstijgen_SeconfParamTrue_expectFalse(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(1500, 70,false);

        //assert
        assertFalse(result);
    }
    @Test
    public void magOpstijgen_AllParamFalse_expectFalse(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(2000, 2,false);

        //assert
        assertFalse(result);
    }
    
}
