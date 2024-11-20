package com.project.shop_spring_2024.services.Order;

import com.project.shop_spring_2024.dtos.OrderDTO;
import com.project.shop_spring_2024.exceptions.DataNotFoundException;
import com.project.shop_spring_2024.models.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
}
