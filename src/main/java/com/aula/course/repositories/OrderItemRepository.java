package com.aula.course.repositories;

import com.aula.course.entities.OrderItem;
import com.aula.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
