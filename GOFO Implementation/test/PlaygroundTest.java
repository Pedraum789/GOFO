import org.junit.Test;
import System.Playground;
import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    @Test
    public void CheckAvailableTest() {

        Playground playground = new Playground();
        playground.setStatus("available");
        assertEquals("available",playground.getStatus());

    }



}
