package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {

    @Test
    void zeroIsEmptyString() {
        check(0, "");
    }

    @Test
    void oneIsI(){
        check(1, "I");
    }

    @Test
    void twoISII() {
        check(2, "II");
    }

    @Test
    void fiveIsV() {
        check(5,"V");
    }

    @Test
    void eightIsVIII() {
        check(8, "VIII");
    }

    @Test
    void minusnuberIsEmptyString() { check(-2,null);}

    private void check(int decimal, String expected) {
        RomanNumeral romanNumeral = new RomanNumeral(decimal);
        assertEquals(expected, romanNumeral.toString());
    }
}
