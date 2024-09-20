package com.api.ERP.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ERP.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}