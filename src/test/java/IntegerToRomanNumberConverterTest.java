import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanNumberConverterTest {

    private IntegerToRomanNumberConverter converter;

    @Before
    public void doBefore() {
        Map<Integer, String> mainNumberMapping = new HashMap<Integer, String>() {{
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
        }};

        converter = new IntegerToRomanNumberConverter(mainNumberMapping);
    }

    @Test
    public void shouldConvertOneTwoThree() throws Exception {
        assertEquals("I", converter.convert(1));
        assertEquals("II", converter.convert(2));
        assertEquals("III",  converter.convert(3));
    }

    @Test
    public void shouldConvertMainNumber() throws Exception {
        assertEquals("V", converter.convert(5));
        assertEquals("X", converter.convert(10));
        assertEquals("L", converter.convert(50));
        assertEquals("C", converter.convert(100));
    }

    @Test
    public void shouldConvertSixSevenEight() throws Exception {
        assertEquals("VI", converter.convert(6));
        assertEquals("VII", converter.convert(7));
        assertEquals("VIII", converter.convert(8));
    }

    @Test
    public void shouldConvertEleven() throws Exception {
        assertEquals("XI", converter.convert(11));
        assertEquals("XII", converter.convert(12));
        assertEquals("XIII", converter.convert(13));
    }
}
