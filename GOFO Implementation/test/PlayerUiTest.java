import System.Player;
import UI.PlayerUI;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerUiTest {

    @Test
    public void IsExistPlayerTest() {

        Player player = new Player();
        player.setEmail("grupo@gmail.com");

        ArrayList<Player> players = new ArrayList<>();
        players.add(player);

        assertEquals(true, PlayerUI.isExistPlayer(players, "grupo@gmail.com"));
    }

    @Test
    public void IsNotExistPlayerTest() {

        Player player = new Player();
        player.setEmail("grupo@gmail.com");

        ArrayList<Player> players = new ArrayList<>();
        players.add(player);

        assertEquals(false, PlayerUI.isExistPlayer(players, "grupo123@gmail.com"));
    }
}
