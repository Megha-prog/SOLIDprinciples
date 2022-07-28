package org.example.Wallet;

import org.example.Payment.Cashback;
import org.example.Payment.ScratchCard;
import org.example.Payment.SendMoney;

public class GooglePay implements Wallet, SendMoney, ScratchCard, Cashback {

    int amount;
    @Override
    public void config() {
        System.out.println("*** Google Pay ***");
        sendMoney(500);
        getScratchCard();
        getCashBackAsCreditBalance();
    }

    @Override
    public void sendMoney(int money) {
        System.out.println("Sending Money... Rs."+money);
        this.amount = money;
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
