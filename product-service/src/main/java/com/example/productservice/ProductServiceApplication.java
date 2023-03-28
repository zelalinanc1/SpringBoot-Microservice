package com.example.productservice;

import com.example.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@RequiredArgsConstructor
@EnableDiscoveryClient
public class ProductServiceApplication {
	private final ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
