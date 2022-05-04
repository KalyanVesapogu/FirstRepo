package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.bean.Product;

public interface ProductDAO  extends JpaRepository<Product, Integer>{

}
