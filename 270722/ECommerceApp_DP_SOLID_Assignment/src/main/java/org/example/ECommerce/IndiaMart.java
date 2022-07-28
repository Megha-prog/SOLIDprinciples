package org.example.ECommerce;

import org.example.PaymentVia.CreditDebitCards;
import org.example.PaymentVia.PaymentService;
import org.example.PaymentVia.Wallets;
import org.example.Services.WholesaleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndiaMart implements ECommerce, WholesaleService {

    List<String> items = new ArrayList<>();
    int amount;
    Scanner sc;
    @Override
    public void config() {
        System.out.println("Welcome to India-Mart");
        selectItems();
        transaction();
        showCart(this.items);
    }

    @Override
    public void selectItems() {

        sc = new Scanner(System.in);
        System.out.println("(Rs.500 per item)\nNumber of items to buy?");
        int numOfItems = sc.nextInt();
        this.amount = 500*numOfItems; //calculating amount directly by numOFItems

        for (int i = 0; i < numOfItems; i++) {
            System.out.println("Enter the name of Item: ");
            items.add(sc.nextLine());
        }


    }

    public void transaction() {
        System.out.println("How do you want to do the payment?\n1.Credit/Debit Card\n2.Wallets");
        int choice = sc.nextInt();
        if(choice==1){
            CreditDebitCards card = new CreditDebitCards();
            card.doPayment(this.amount);
        } else if (choice==2) {
            Wallets wallets= new Wallets();
            wallets.doPayment(this.amount);
        }

    }
    @Override
    public void showCart(List<String> items) {
        System.out.println("Your Cart: "+items.toString());
    }

}
