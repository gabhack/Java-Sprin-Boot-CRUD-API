package com.demo.ejercicio.Persistence.CRUD;

import com.demo.ejercicio.Persistence.Entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    List<Compra> getByClientId(int clientId);
}
