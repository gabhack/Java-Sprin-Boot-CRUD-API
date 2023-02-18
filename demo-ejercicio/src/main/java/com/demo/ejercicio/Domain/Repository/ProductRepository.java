package com.demo.ejercicio.Domain.Repository;

import com.demo.ejercicio.Domain.Product;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();

    List<Product> findByIdCategory(Integer categoryId);

    List<Product> findByName(String name);

    void delete(int productId);

}
