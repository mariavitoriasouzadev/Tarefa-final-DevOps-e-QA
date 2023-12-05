package com.projects.domain.usecases;

import com.projects.domain.Order;
import com.projects.domain.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceOrderUseCase {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long orderId) {
        return orderRepository.findById(orderId);
    }

    public void placeOrder(Order order) {
        orderRepository.save(order);
    }

    public boolean updateOrder(Order order) {
        if (orderRepository.existsById(order.getId())) {
            orderRepository.save(order);
            return true;
        }
        return false;
    }

    public boolean deleteOrder(Long orderId) {
        if (orderRepository.existsById(orderId)) {
            orderRepository.deleteById(orderId);
            return true;
        }
        return false;
    }
}

