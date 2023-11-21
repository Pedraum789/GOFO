import UI.SystemUI;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemUITest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void SystemUIIsStringTest() {
        String teste = SystemUI.isString("Teste");

        Assert.assertEquals("Teste", teste);
    }

    @Test
    public void SystemUIStringToIntTest() {
        int teste = SystemUI.stringToInt("1");

        Assert.assertEquals(1, teste);
    }
}
