package org.example;

public class GooglePay implements UPIpayment,CashBackManager{
    @Override
    public double getCashBackAsCreditbAlance() {
        return 0;
    }

    @Override
    public String sendMoney() {
        return null;
    }

    @Override
    public String getStractchcard() {
        return null;
    }
}
