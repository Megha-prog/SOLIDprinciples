package org.example;

import org.example.Wallet.Wallet;
import org.example.Wallet.Walletfactory;

public class Main {
    public static void main(String[] args) {
        Walletfactory factory = new Walletfactory();
        Wallet wallet = factory.getInstance("GooglePay");
        wallet.config();
    }
}