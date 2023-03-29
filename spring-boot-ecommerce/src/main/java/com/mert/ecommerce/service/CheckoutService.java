package com.mert.ecommerce.service;

import com.mert.ecommerce.dto.Purchase;
import com.mert.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
