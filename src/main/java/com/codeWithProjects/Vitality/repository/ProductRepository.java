package com.codeWithProjects.Vitality.repository;


import com.codeWithProjects.Vitality.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
