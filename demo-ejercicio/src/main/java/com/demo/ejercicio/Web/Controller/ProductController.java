package com.demo.ejercicio.Web.Controller;

import com.demo.ejercicio.Domain.Product;
import com.demo.ejercicio.Domain.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll()
    {
            return productService.getAll();
    }

    public List<Product> findByIdCategory(Integer categoryId)
    {
        return productService.findByIdCategory(categoryId);
    }
    public List<Product> findByName(String name) {
        return productService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return productService.delete(productId);
    }
}
