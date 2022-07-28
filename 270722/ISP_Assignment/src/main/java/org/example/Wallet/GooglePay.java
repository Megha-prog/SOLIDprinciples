package org.example.Wallet;

import org.example.Payment.Manager;
import org.example.Payment.UPI;

public class GooglePay implements Wallet, UPI, Manager {

    int amount;
    @Override
    public void config() {
        System.out.println("*** Google Pay ***");
        sendMoney(500);
        getScratchCard();
        getCashBackAsCreditBalance();
    }

    @Override
    public void sendMoney(int amount) {
        this.amount = amount;
    }

    @Override
    public void getScratchCard() {
        System.out.println("Your Scratch Card having amount Rs."+amount+" is on its way");
    }

    @Override
    public void getCashBackAsCreditBalance() {
        System.out.println("Cashback of Rs."+amount+" is getting credited in Balance soon...." );
    }
}
