package com.project.shop_spring_2024.repositories;

import com.project.shop_spring_2024.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {}
