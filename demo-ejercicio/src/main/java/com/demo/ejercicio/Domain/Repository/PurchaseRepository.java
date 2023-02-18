package com.demo.ejercicio.Domain.Repository;

import com.demo.ejercicio.Domain.Purchase;

import java.util.List;

public interface PurchaseRepository
{
    List<Purchase> getAll();
    List<Purchase> getByClientId(int clientId);
    Purchase save(Purchase purchase);
}
