package com.bouchtaouimarouane.customerfrontthymeleafapp.repository;


import com.bouchtaouimarouane.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
