package com.demo.ejercicio.Persistence;

import com.demo.ejercicio.Domain.Purchase;
import com.demo.ejercicio.Domain.Repository.PurchaseRepository;
import com.demo.ejercicio.Persistence.CRUD.CompraCrudRepository;
import com.demo.ejercicio.Persistence.Entity.Compra;
import com.demo.ejercicio.Persistence.Mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompraRepositorio implements PurchaseRepository {
   @Autowired
    PurchaseMapper purchaseMapper;
   @Autowired
   CompraCrudRepository compraCrudRepository;
    @Override
    public List<Purchase> getAll() {
       return  purchaseMapper.toPurchases((List<Compra>)compraCrudRepository.findAll());
    }

    @Override
    public List<Purchase> getByClientId(int clientId) {
        return purchaseMapper.toPurchases((List<Compra>) compraCrudRepository.getByClientId(clientId));

    }

        @Override
    public Purchase save(Purchase purchase) {
        return null;
    }
}
