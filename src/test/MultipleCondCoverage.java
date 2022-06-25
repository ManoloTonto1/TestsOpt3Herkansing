package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Vlucht;

public class MultipleCondCoverage {
    static Vlucht vlucht = new Vlucht();

    //000
    @Test
    public void magOpstijgen_AllParamFalse_expectFalse() {
    
        // arrange
        boolean result;
    
        // act
        result = vlucht.magOpstijgen(2000, 2, false);
    
        // assert
        assertFalse(result);
    }
    //001
    @Test
    public void magOpstijgen_ThirdParamTrue_expectFalse() {
    
        // arrange
        boolean result;
    
        // act
        result = vlucht.magOpstijgen(2000, 2, true);
    
        // assert
        assertFalse(result);
    }
    //011
    @Test
    public void magOpstijgen_FirstParamFalse_expectTrue(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(1001, 51,true);

        //assert
        assertTrue(result);
    }

    //010
    @Test
    public void magOpstijgen_SecondParamTrue_expectFalse(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(2000, 51,false);

        //assert
        assertFalse(result);
    }
    //110
    @Test
    public void magOpstijgen_ThirdParamfalse_expectFalse(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(900, 51,false);

        //assert
        assertFalse(result);
    }

    //111
    @Test
    public void magOpstijgen_AllParamTrue_expectTrue(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(999, 51,true);

        //assert
        assertTrue(result);
    }
    //101
    @Test
    public void magOpstijgen_SecondParamFalse_expectTrue(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(999, 2,true);

        //assert
        assertTrue(result);
    }
    //100
    @Test
    public void magOpstijgen_FirstParamTrue_expectFalse(){

        //arrange
        boolean result;

        //act
        result = vlucht.magOpstijgen(999, 2,false);

        //assert
        assertFalse(result);
    }
    
   
}
