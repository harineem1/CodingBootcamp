package com.company.HarineeMadhusudhanU1Capstone.controller;


import com.company.HarineeMadhusudhanU1Capstone.servicelayer.ServiceLayer;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.ConsoleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/console")//This mapping at class level allows to set the base path for the Customer API
public class ConsoleController {

    @Autowired
    ServiceLayer gameStoreService;

//    @PostMapping//Another way to set the Rest API Post mapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public ConsoleViewModel createConsole(@RequestBody @Valid ConsoleViewModel console) {
//        return gameStoreService.saveConsole(console);
//    }
//    @GetMapping("/{id}")//Another way to set the Rest API Get mapping
//    @ResponseStatus(HttpStatus.OK)
//    public ConsoleViewModel getConsole(@PathVariable("id") int consoleId) {
//        ConsoleViewModel = gameStoreService.findConsoleByConsoleId(consoleId);
//
//        return gameStoreService.findConsoleByConsoleId(consoleId);
//    }



}
