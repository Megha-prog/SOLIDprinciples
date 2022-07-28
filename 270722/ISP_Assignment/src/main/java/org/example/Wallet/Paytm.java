package org.example.Wallet;

import org.example.Payment.UPI;

public class Paytm implements Wallet, UPI {
    int amount;
    @Override
    public void config() {
        System.out.println("*** Paytm ***");
    }
    @Override
    public void sendMoney(int amount) {
        this.amount = amount;
    }

    @Override
    public void getScratchCard() {
        System.out.println("Your Scratch Card having amount Rs."+amount+" is on its way");
    }
}
