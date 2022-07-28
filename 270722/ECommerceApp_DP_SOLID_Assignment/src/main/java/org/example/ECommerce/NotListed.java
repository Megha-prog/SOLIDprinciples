package org.example.ECommerce;

import java.util.List;

public class NotListed implements ECommerce{
    @Override
    public void config() {
        System.out.println("Unavailable");
    }

    @Override
    public void showCart(List<String> items) {}

}
