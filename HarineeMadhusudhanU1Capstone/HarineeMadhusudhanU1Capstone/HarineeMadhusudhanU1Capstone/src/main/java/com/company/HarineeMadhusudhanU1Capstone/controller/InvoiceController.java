package com.company.HarineeMadhusudhanU1Capstone.controller;

import com.company.HarineeMadhusudhanU1Capstone.servicelayer.ServiceLayer;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.ConsoleViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.PurchasingViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.InvoiceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
public class InvoiceController {

    @Autowired
    ServiceLayer serviceLayer;


    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceViewModel createInvoices(@RequestBody @Valid PurchasingViewModel invoices) {
        return serviceLayer.saveInvoice(invoices);
    }

}
