package org.example.Wallet;

public class NotListed implements Wallet{
    @Override
    public void config() {
        System.out.println("Not Available");
    }
}
