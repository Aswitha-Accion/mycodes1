package com.repo;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<User,Integer> {
    //public void deleteCustomerById(Integer id);
}
