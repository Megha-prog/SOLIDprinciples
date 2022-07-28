package org.example.Wallet;

import org.example.Payment.ScratchCard;
import org.example.Payment.SendMoney;

public class Paytm implements Wallet, SendMoney {
    int amount;
    @Override
    public void config() {
        System.out.println("*** Paytm ***");
        sendMoney(400);
    }
    @Override
    public void sendMoney(int money) {
        System.out.println("Sending Money...Rs."+money);
        this.amount = money;
    }

}
