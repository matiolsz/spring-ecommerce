package com.olszanka.springecommerce.dto;

import com.olszanka.springecommerce.entity.Address;
import com.olszanka.springecommerce.entity.Customer;
import com.olszanka.springecommerce.entity.Order;
import com.olszanka.springecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
