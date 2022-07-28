package org.example;

public class CreditCard implements BankCard{
    public void doTransaction(double amount) {
        System.out.println("payment done by credit card");
    }
}
