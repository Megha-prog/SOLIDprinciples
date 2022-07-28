package org.example;
import org.example.ECommerce.ECommerce;
import org.example.ECommerce.ECommerceFactory;

public class Main {
    public static void main(String[] args) {
        ECommerceFactory factory = new ECommerceFactory();
        ECommerce eCommerce = factory.getInstance("Alibaba");
        eCommerce.config();
    }
}