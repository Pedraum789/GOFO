import org.junit.Test;
import System.PlaygroundOwner;
import System.Playground;
import UI.playgroundOwnerUI;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayGroundOwnerUITest {

    @Test
    public void PlaygroundExistsTest() {

        PlaygroundOwner playgroundOwner = new PlaygroundOwner();
        Playground playground = new Playground();
        playground.setName("teste");
        playgroundOwner.addPlayground(playground);

        ArrayList<PlaygroundOwner> playgroundOwners = new ArrayList<>();
        playgroundOwners.add(playgroundOwner);

        playgroundOwnerUI playgroundOwnerUI = new playgroundOwnerUI();

        assertEquals(true, playgroundOwnerUI.playgroundExists(playgroundOwners, "teste"));

    }

    @Test
    public void PlaygroundNotExistsTest() {

        PlaygroundOwner playgroundOwner = new PlaygroundOwner();
        Playground playground = new Playground();
        playground.setName("teste123");
        playgroundOwner.addPlayground(playground);

        ArrayList<PlaygroundOwner> playgroundOwners = new ArrayList<>();
        playgroundOwners.add(playgroundOwner);

        playgroundOwnerUI playgroundOwnerUI = new playgroundOwnerUI();

        assertEquals(false, playgroundOwnerUI.playgroundExists(playgroundOwners, "teste"));

    }
}
