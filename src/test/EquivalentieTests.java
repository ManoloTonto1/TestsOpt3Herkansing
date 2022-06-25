package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Bagage;
import app.Vliegtuig;
import app.Vlucht;

public class EquivalentieTests {
    static Vlucht vlucht = new Vlucht();

    @Test
    public void calcLanding_EquivalentieKlasse1_GewichtIs0_Expect0(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(0, 0, bagage, vliegtuig);
        //assert
        assertEquals(0,result);
    }
    @Test
    public void calcLanding_EquivalentieKlasse1_GewichtIs1_Expect100(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(1, 0, bagage, vliegtuig);
        //assert
        assertEquals(100,result);
    }
    @Test
    public void calcLanding_EquivalentieKlasse1_GewichtIs999_Expect100(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(999, 0, bagage, vliegtuig);
        //assert
        assertEquals(100,result);
    }
    @Test
    public void calcLanding_EquivalentieKlasse2_GewichtIs1000_Expect500(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(1000, 0, bagage, vliegtuig);
        //assert
        assertEquals(500,result);
    }
    @Test
    public void calcLanding_EquivalentieKlasse2_GewichtIs1001_Expect500(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(1001, 0, bagage, vliegtuig);
        //assert
        assertEquals(500,result);
    }
    @Test
    public void calcLanding_EquivalentieKlasse2_GewichtIs4999_Expect500(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(4999, 0, bagage, vliegtuig);
        //assert
        assertEquals(500,result);
    }
    @Test
    public void calcLanding_EquivalentieKlasse3_GewichtIs5000_Expect2500(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(5000, 0, bagage, vliegtuig);
        //assert
        assertEquals(2500,result);
    }
    @Test
    public void calcLanding_EquivalentieKlasse3_GewichtIs5001_Expect2500(){

        //arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        //act
        result = vlucht.calcLanding(5001, 0, bagage, vliegtuig);
        //assert
        assertEquals(2500,result);
    }
}
