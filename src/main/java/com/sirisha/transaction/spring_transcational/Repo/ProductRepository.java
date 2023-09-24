package com.sirisha.transaction.spring_transcational.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sirisha.transaction.spring_transcational.DTO.Product;

public class ProductRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void saveProduct(Product product) {
        String sql = "INSERT INTO PRODUCT VALUES(?,?)";
        Object[] args= {product.getId(),product.getName()};
        jdbcTemplate.update(sql,args);
        System.out.println("Product Saved");
    }
    

}
