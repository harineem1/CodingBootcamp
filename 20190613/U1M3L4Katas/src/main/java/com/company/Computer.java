package com.company;

public class Computer {

    private String Brand;
    private String Model;
    private  String CPU;
    private int RAM;
    private int Storage;

    public Computer(String brand, String model, String CPU, int RAM, int storage) {
        Brand = brand;
        Model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        Storage = storage;
    }
    public Computer(){

    }
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }
}
