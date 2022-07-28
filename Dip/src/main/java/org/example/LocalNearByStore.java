package org.example;

public class LocalNearByStore {

     BankCard bankCard;


    LocalNearByStore(BankCard bankCard){
        this.bankCard=bankCard;
    }

    public void doPayment(Object order ,double amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard card = new DebitCard();
        LocalNearByStore store=new LocalNearByStore(card);
        store.doPayment("Buy Groceries"+ "via"+ card,100);
    }
}
