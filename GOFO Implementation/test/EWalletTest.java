import UI.PlayerUI;
import org.junit.Test;
import System.eWallet;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EWalletTest {

    @Test
    public void DepositTest() {

        eWallet eWallet = new eWallet();

        eWallet.deposit(2);

        assertEquals(2, eWallet.getBalance());
    }

    @Test
    public void WithdrawTest() {
        eWallet eWallet = new eWallet();

        eWallet.deposit(2);

        eWallet.withdraw(1);

        assertEquals(1, eWallet.getBalance());
    }

}
