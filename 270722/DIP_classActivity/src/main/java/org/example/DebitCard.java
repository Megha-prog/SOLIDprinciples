package org.example;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(double amount) {
        System.out.println("Transaction via Debit Card");
    }
}
