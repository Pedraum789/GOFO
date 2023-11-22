import UI.SystemUI;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SystemUITest {

    private final InputStream originalSystemIn = System.in;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    private ByteArrayInputStream testInput;

    @Before
    public void setUpInput() {
        System.setIn(new ByteArrayInputStream("invalidInput\n".getBytes()));
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restoreSystemInAndOut() {
        System.setIn(originalSystemIn);
        System.setOut(System.out);
    }
    @Test
    public void IsStringWithInvalidInputTest() {
        String result = SystemUI.isString("123");
        assertEquals("please don't enter integers or special characters", outputStream.toString().trim());
        assertEquals("invalidInput", result);
    }

    @Test
    public void IsStringTest() {
        Assert.assertEquals("Teste", SystemUI.isString("Teste"));
    }

    @Test
    public void StringToIntTest() {
        Assert.assertEquals(1, SystemUI.stringToInt("1"));
    }

    @Test
    public void IsDigitTest() {
        Assert.assertEquals("1", SystemUI.isDigit("1"));
    }

    @Test
    public void IsEmailTest() {
        Assert.assertEquals("grupoppgg@gmail.com", SystemUI.isEmail("grupoppgg@gmail.com"));
    }

}
