package com.sirisha.transaction.spring_transcational;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sirisha.transaction.spring_transcational.Config.ProductConfig;
import com.sirisha.transaction.spring_transcational.Service.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
        context.registerShutdownHook();
        ProductService ps=context.getBean("productService",ProductService.class);
        ps.saveProductInfo();
        
        context.close();
    }
}
