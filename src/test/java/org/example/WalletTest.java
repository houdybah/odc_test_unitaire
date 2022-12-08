package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {


    
    @Test
    public void testWalletCreated()
    {
        Wallet wallet = new Wallet(500000);
        double actual = wallet.getSolde();
        assertEquals(500000,actual);
    }

}
