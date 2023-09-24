package com.sirisha.transaction.spring_transcational.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sirisha.transaction.spring_transcational.DTO.Product;
import com.sirisha.transaction.spring_transcational.Repo.ProductRepository;

public class ProductService {
    
    
    @Autowired
    ProductRepository productRepository;
    
    public void saveProductInfo() {
        
        
        for(int i = 1; i<=10; i++) {
            
            Product product = new Product();
            product.setId(i);
            product.setName("Product " + i);
            productRepository.saveProduct(product);
        }
    }

}
