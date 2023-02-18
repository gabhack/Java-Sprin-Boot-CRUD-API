package com.demo.ejercicio.Persistence.CRUD;

import com.demo.ejercicio.Persistence.Entity.ComprasProducto;
import org.springframework.data.repository.CrudRepository;

public interface CompraProductoCrudRepository extends CrudRepository<ComprasProducto, Integer> {
}
