package org.example;

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(double amount) {
        System.out.println("Transaction via Credit Card");
    }
}
