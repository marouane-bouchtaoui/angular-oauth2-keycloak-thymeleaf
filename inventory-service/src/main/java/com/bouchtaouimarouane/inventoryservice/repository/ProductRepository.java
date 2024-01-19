package com.bouchtaouimarouane.inventoryservice.repository;

import com.bouchtaouimarouane.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
