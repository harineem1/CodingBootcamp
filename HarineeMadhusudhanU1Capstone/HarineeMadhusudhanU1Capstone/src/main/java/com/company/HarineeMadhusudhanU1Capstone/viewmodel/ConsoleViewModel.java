package com.company.HarineeMadhusudhanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class ConsoleViewModel {
    private Integer consoleId;
    @NotEmpty(message = "Please supply a value for model")
    private String model;
    @NotEmpty(message = "Please supply a value for manufacturer")
    private String manufacturer;
    @NotEmpty(message = "Please supply a value for memoryAmount")
    private String memoryAmount;
    @NotEmpty(message = "Please supply a value for processor")
    private BigDecimal processor;
    @NotEmpty(message = "Please supply a value for price")
    private String price;
    @NotEmpty(message = "Please supply a value for quantity")
    private Integer quantity;

    public Integer getConsoleId() {
        return consoleId;
    }

    public void setConsoleId(Integer consoleId) {
        this.consoleId = consoleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(String memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public BigDecimal getProcessor() {
        return processor;
    }

    public void setProcessor(BigDecimal processor) {
        this.processor = processor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsoleViewModel that = (ConsoleViewModel) o;
        return Objects.equals(consoleId, that.consoleId) &&
                model.equals(that.model) &&
                manufacturer.equals(that.manufacturer) &&
                memoryAmount.equals(that.memoryAmount) &&
                processor.equals(that.processor) &&
                price.equals(that.price) &&
                quantity.equals(that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consoleId, model, manufacturer, memoryAmount, processor, price, quantity);
    }
}
