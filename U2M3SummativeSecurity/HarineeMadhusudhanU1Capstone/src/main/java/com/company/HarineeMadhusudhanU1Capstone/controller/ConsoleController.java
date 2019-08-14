package com.company.HarineeMadhusudhanU1Capstone.controller;


import com.company.HarineeMadhusudhanU1Capstone.servicelayer.ServiceLayer;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.ConsoleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/console")//This mapping at class level allows to set the base path for the Customer API
public class ConsoleController {

    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getAllconsoles() {
        return serviceLayer.findAllConsoles();
    }

    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConsoleViewModel createConsoles(@RequestBody @Valid ConsoleViewModel consoles) {
        return serviceLayer.saveConsole(consoles);
    }

    @GetMapping("/{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public ConsoleViewModel getConsole(@PathVariable("id") int consoleId) {
        ConsoleViewModel consoleViewModel = serviceLayer.findConsoleByConsoleId(consoleId);
        if (consoleViewModel == null)
            throw new IllegalArgumentException("Console could not be retrieved for id " + consoleId);
        return consoleViewModel;
    }

    @DeleteMapping("/{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConsole(@PathVariable("id") int consoleId) {
        serviceLayer.removeConsole(consoleId);
    }

    @PutMapping("/{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateConsole(@PathVariable("id") int consoleId, @RequestBody @Valid ConsoleViewModel consoleViewModel) {
        if (consoleViewModel.getConsoleId() == 0)
            consoleViewModel.setConsoleId(consoleId);
        if (consoleId != consoleViewModel.getConsoleId()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID");
        }
        serviceLayer.updateConsole(consoleViewModel);
    }

    @GetMapping("/manufacturer/{manufacturer}")
    @ResponseStatus(HttpStatus.OK)
    public List<ConsoleViewModel> getConsoleByManufacturer(@PathVariable("manufacturer") String manufacturer) {
        List<ConsoleViewModel> console = serviceLayer.findConsoleByManufacturer(manufacturer);
        if (console != null && console.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for customer " + manufacturer);
        return console;
    }





}
