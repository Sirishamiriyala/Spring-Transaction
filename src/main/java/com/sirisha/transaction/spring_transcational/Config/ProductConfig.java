package com.sirisha.transaction.spring_transcational.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com")

public class ProductConfig {
    
    public DataSource dataSource() {
        return new DriverManagerDataSource(
            "jdbc:mysql://localhost:3306/Product",
            "root",
            "siri");
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate() {
        
        return new JdbcTemplate(dataSource());
    }

}
