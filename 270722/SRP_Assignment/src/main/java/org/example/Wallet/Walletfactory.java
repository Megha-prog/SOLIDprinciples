package org.example.Wallet;

public class Walletfactory {
    public Wallet getInstance(String Type){
        switch(Type){
            case "GooglePay" : {
                return new GooglePay();
            }
            case "Paytm" : {
                return new Paytm();
            }
            default: return new NotListed();
        }
    }
}
