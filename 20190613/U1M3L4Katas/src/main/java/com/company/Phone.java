package com.company;

public class Phone {
    private String brand, model, processor;
    private int price, storage;

    public Phone(String brand, String model, String processor, int price, int storage) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.price = price;
        this.storage = storage;
    }
    public Phone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
