package com.company.HarineeMadhusudhanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
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
    private String  processor;
    @PositiveOrZero(message = "Please supply a positive or zero value for price")
    private BigDecimal price;
    @Positive(message = "Please supply a  positive value for quantity")
    private Integer quantity;

    public ConsoleViewModel(Integer consoleId, @NotEmpty(message = "Please supply a value for model") String model,
                            @NotEmpty(message = "Please supply a value for manufacturer") String manufacturer,
                            @NotEmpty(message = "Please supply a value for memoryAmount") String memoryAmount,
                            @NotEmpty(message = "Please supply a value for processor") String processor,
                            @PositiveOrZero(message = "Please supply a positive or zero value for price") BigDecimal price,
                            @Positive(message = "Please supply a  positive value for quantity") Integer quantity) {
        this.consoleId = consoleId;
        this.model = model;
        this.manufacturer = manufacturer;
        this.memoryAmount = memoryAmount;
        this.processor = processor;
        this.price = price;
        this.quantity = quantity;
    }

    public ConsoleViewModel() {
    }

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

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProcessor() {
        return processor;
    }

    public BigDecimal getPrice() {
        return price;
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
