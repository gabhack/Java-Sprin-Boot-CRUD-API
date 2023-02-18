package com.demo.ejercicio.Domain.Service;

import com.demo.ejercicio.Domain.Purchase;
import com.demo.ejercicio.Domain.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;
    public List<Purchase> getAll()
    {
      return  purchaseRepository.getAll();
    };
   public  List<Purchase> getByClientId(int clientId)
    {
        return purchaseRepository.getByClientId(clientId);
    }
   public  Purchase save(Purchase purchase)
    {
        return purchaseRepository.save(purchase);
    }

}
