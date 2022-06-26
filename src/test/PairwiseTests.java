package test;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Bagage;
import app.Vliegtuig;
import app.Vlucht;

public class PairwiseTests {
    static Vlucht vlucht = new Vlucht();

    @Test
    public void calcLanding_500_2_ja_ja_Expect_1149() {
        // arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(true);
        Bagage bagage = new Bagage(true);
        // act
        result = vlucht.calcLanding(500, 2, bagage, vliegtuig);
        // assert
        assertEquals(1149, result);
    }

    @Test
    public void calcLanding_500_50_nee_nee_Expected_150() {
        // arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(false);
        // act
        result = vlucht.calcLanding(500, 50, bagage, vliegtuig);
        // assert
        assertEquals(150, result);
    }
    @Test
    public void calcLanding_1500_2_ja_nee_Expected_907() {
        // arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(true);
        Bagage bagage = new Bagage(false);
        // act
        result = vlucht.calcLanding(1500, 2, bagage, vliegtuig);
        // assert
        assertEquals(907, result);
    }
    @Test
    public void calcLanding_1500_50_nee_ja_Expected_1550() {
        // arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(true);
        // act
        result = vlucht.calcLanding(1500, 50, bagage, vliegtuig);
        // assert
        assertEquals(1550, result);
    }
    @Test
    public void calcLanding_6500_2_nee_ja_Expected_4550() {
        // arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(false);
        Bagage bagage = new Bagage(true);
        // act
        result = vlucht.calcLanding(6500, 2, bagage, vliegtuig);
        // assert
        assertEquals(4550, result);
    }
    @Test
    public void calcLanding_6500_50_ja_nee_Expected_4537s() {
        // arrange
        int result;
        Vliegtuig vliegtuig = new Vliegtuig(true);
        Bagage bagage = new Bagage(false);
        // act
        result = vlucht.calcLanding(6500, 50, bagage, vliegtuig);
        // assert
        assertEquals(4537, result);
    }
}