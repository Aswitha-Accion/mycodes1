package com.repo;

import com.entity.Order;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface orderRepsoitory extends JpaRepository<Order, Integer> {

    List<Order> findAllByUserOrderByCreatedDateDesc(User user);
}


