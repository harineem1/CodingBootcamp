package com.company.HarineeMadhusudhanU1Capstone.controller;

import com.company.HarineeMadhusudhanU1Capstone.servicelayer.ServiceLayer;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.TShirtViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import javax.validation.Valid;

@RestController
@RequestMapping(value = "/tshirt")
public class TShirtController {
    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getAllTShirts() {
        return serviceLayer.findAllTShirts();
    }

    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public TShirtViewModel createTShirt(@RequestBody @Valid TShirtViewModel tShirt) {
        return serviceLayer.saveTShirt(tShirt);
    }

    @GetMapping("{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public TShirtViewModel getTShirt(@PathVariable("id") int tShirtId) {
        TShirtViewModel tShirtViewModel = serviceLayer.findTShirtBytShirtId(tShirtId);
        if (tShirtViewModel == null)
            throw new IllegalArgumentException("TShirts could not be retrieved for id " + tShirtId);
        return tShirtViewModel;
    }

    @DeleteMapping("{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTShirt(@PathVariable("id") int tShirtId) {
        serviceLayer.removeTShirt(tShirtId);
    }

    @PutMapping("{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTShirt(@PathVariable("id") int tShirtId, @RequestBody @Valid TShirtViewModel tshirtViewModel) {
        if (tshirtViewModel.gettShirtId() == 0)
            tshirtViewModel.settShirtId(tShirtId);
        if (tShirtId != tshirtViewModel.gettShirtId()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID");
        }
        serviceLayer.updateTShirt(tshirtViewModel);
    }

    @GetMapping("/color/{color}")
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getTShirtByColor(@PathVariable("color") String color) {
        List<TShirtViewModel> tShirt = serviceLayer.findTShirtByColor(color);
        if (tShirt != null && tShirt.size() == 0)
            throw new IllegalArgumentException("TShirts could not be retrieved for customer " + color);
        return tShirt;
    }

    @GetMapping("/size/{size}")
    @ResponseStatus(HttpStatus.OK)
    public List<TShirtViewModel> getTShirtBySize(@PathVariable("size") String size) {
        List<TShirtViewModel> tShirt = serviceLayer.findTShirtBySize(size);
        if (tShirt != null && tShirt.size() == 0)
            throw new IllegalArgumentException("TShirts could not be retrieved for customer " + size);
        return tShirt;
    }



}
