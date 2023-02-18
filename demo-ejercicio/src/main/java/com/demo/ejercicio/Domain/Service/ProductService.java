package com.demo.ejercicio.Domain.Service;

import com.demo.ejercicio.Domain.Product;
import com.demo.ejercicio.Domain.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAll()
    {
        return productRepository.getAll();
    }

    public List<Product> findByIdCategory(Integer categoryId)
    {
        return productRepository.findByIdCategory(categoryId);
    }
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    public boolean delete(int productId){
        productRepository.delete(productId);
        return false;
    }


}
