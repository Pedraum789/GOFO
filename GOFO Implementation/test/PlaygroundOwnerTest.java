import System.Playground;
import System.PlaygroundOwner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundOwnerTest {

    @Test
    public void ExistPlaygroundTest() {
        PlaygroundOwner playgroundOwner = new PlaygroundOwner();

        Playground playground = new Playground();
        playground.setName("teste");

        playgroundOwner.addPlayground(playground);

        assertEquals(true, playgroundOwner.existPlayground("teste"));
    }

    @Test
    public void NotExistPlaygroundTest() {
        PlaygroundOwner playgroundOwner = new PlaygroundOwner();

        Playground playground = new Playground();
        playground.setName("teste123");

        playgroundOwner.addPlayground(playground);

        assertEquals(false, playgroundOwner.existPlayground("teste"));
    }
}
