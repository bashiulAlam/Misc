package com.helloWorld;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sabab on 12/5/2018.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    List<Customer> findByFirstName(String firstName);
}
