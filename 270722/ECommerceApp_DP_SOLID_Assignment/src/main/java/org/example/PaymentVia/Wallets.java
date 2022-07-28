package org.example.PaymentVia;

public class Wallets implements  PaymentService{
    @Override
    public void doPayment(int amount) {
        System.out.println("Doing Payment Using Wallet of Rs."+amount);
    }
}
