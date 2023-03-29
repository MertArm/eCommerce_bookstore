package com.mert.ecommerce.dto;

import com.mert.ecommerce.entity.Address;
import com.mert.ecommerce.entity.Customer;
import com.mert.ecommerce.entity.Order;
import com.mert.ecommerce.entity.OrderItem;
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
