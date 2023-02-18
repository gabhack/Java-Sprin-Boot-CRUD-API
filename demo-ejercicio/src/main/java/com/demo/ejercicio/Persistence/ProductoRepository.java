package com.demo.ejercicio.Persistence;

import com.demo.ejercicio.Domain.Product;
import com.demo.ejercicio.Domain.Repository.ProductRepository;
import com.demo.ejercicio.Persistence.CRUD.ProductoCrudRepository;
import com.demo.ejercicio.Persistence.Entity.Producto;
import com.demo.ejercicio.Persistence.Mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getAll()
    {
        return productMapper.toProducts((List<Producto>) productoCrudRepository.findAll());
    }

    @Override
    public List<Product> findByIdCategory(Integer categoryId)
    {
        return productMapper.toProducts( (List<Producto>) productoCrudRepository.findByIdCategoria(categoryId));

    }
    @Override
    public List<Product> findByName(String name) {
        return productMapper.toProducts((List<Producto>) productoCrudRepository.findByNombre(name));
    }

    @Override
    public void delete(int productId) {
        productoCrudRepository.deleteById(productId);
    }



}
