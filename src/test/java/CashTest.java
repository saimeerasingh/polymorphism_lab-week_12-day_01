import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashTest {

    Cash cash;

    @Before
    public void before(){
        cash = new Cash(CashDenomination.FIFTY);
    }

    @Test
    public void canPay(){
        assertEquals("Cash paid", cash.pay());
    }
}
