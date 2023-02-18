package com.demo.ejercicio.Web.Controller;

import com.demo.ejercicio.Domain.Purchase;
import com.demo.ejercicio.Domain.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @GetMapping("/all")
    List<Purchase> getAll()
    {
        return  purchaseService.getAll();
    };
    List<Purchase> getByClientId(int clientId)
    {
        return purchaseService.getByClientId(clientId);
    }
    Purchase save(Purchase purchase)
    {
        return purchaseService.save(purchase);
    }



}
