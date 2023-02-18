package com.demo.ejercicio.Persistence.CRUD;

import com.demo.ejercicio.Persistence.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoria(Integer idCategoria);

    List<Producto> findByNombre(String nombre);





}
