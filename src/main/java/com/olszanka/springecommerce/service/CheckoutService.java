package com.olszanka.springecommerce.service;

import com.olszanka.springecommerce.dto.Purchase;
import com.olszanka.springecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
