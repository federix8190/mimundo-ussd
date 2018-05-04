package py.com.personal.webvas.mimundo.ussd.rt;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import py.personal.webvas.packs.core.utils.EsmeTextConverter;

public class EsmeTextConverterTest extends TestCase {

    public static Test suite() {
        return new TestSuite( EsmeTextConverterTest.class );
    }

    public void testLetterAvariantLower() {
        String input = "\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5";
        String expected = new String(new char[input.length()]).replace("\0", "a");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterEvariantLower() {
        String input = "\u00E8\u00E9\u00EA\u00EB";
        String expected = new String(new char[input.length()]).replace("\0", "e");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterIvariantLower() {
        String input = "\u00EC\u00ED\u00EE\u00EF";
        String expected = new String(new char[input.length()]).replace("\0", "i");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterOvariantLower() {
        String input = "\u00F2\u00F3\u00F4\u00F5\u00F6";
        String expected = new String(new char[input.length()]).replace("\0", "o");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterUvariantLower() {
        String input = "\u00F9\u00FA\u00FB\u00FC";
        String expected = new String(new char[input.length()]).replace("\0", "u");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterAvariantUpper() {
        String input = "\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5";
        String expected = new String(new char[input.length()]).replace("\0", "A");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterEvariantUpper() {
        String input = "\u00C8\u00C9\u00CA\u00CB";
        String expected = new String(new char[input.length()]).replace("\0", "E");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterIvariantUpper() {
        String input = "\u00CC\u00CD\u00CE\u00CF";
        String expected = new String(new char[input.length()]).replace("\0", "I");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterOvariantUpper() {
        String input = "\u00D2\u00D3\u00D4\u00D5\u00D6";
        String expected = new String(new char[input.length()]).replace("\0", "O");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterEnhevariantLower() {
        String input = "\u00F1";
        String expected = new String(new char[input.length()]).replace("\0", "n");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterEnhevariantUpper() {
        String input = "\u00D1";
        String expected = new String(new char[input.length()]).replace("\0", "N");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterCedilhavariantLower() {
        String input = "\u00E7";
        String expected = new String(new char[input.length()]).replace("\0", "c");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }

    public void testLetterCedilhavariantUpper() {
        String input = "\u00C7";
        String expected = new String(new char[input.length()]).replace("\0", "C");
        EsmeTextConverter esmeTextConverter = new EsmeTextConverter();
        String result = esmeTextConverter.convert(input);
        assertEquals(expected, result);
    }
}