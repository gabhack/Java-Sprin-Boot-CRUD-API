package com.demo.ejercicio.Persistence.CRUD;

import com.demo.ejercicio.Persistence.Entity.Categoria;
import com.demo.ejercicio.Persistence.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {


}
