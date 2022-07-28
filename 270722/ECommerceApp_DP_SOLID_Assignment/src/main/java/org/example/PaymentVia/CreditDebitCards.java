package org.example.PaymentVia;

public class CreditDebitCards implements PaymentService{
    @Override
    public void doPayment(int amount) {
        System.out.println("Doing Payment Using Credit/Debit Card of Rs."+amount);
    }
}
