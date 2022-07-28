package org.example.ECommerce;

import org.example.PaymentVia.PaymentService;

import java.util.List;

public interface ECommerce{
    void config();
    void showCart(List<String> items);
}
