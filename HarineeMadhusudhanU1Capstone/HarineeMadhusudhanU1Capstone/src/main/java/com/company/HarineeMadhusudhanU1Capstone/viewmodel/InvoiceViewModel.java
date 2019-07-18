package com.company.HarineeMadhusudhanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class InvoiceViewModel {

    private int invoiceId;
    @NotEmpty(message = "Please supply a value for name")
    private String name;
    @NotEmpty(message = "Please supply a value for street")
    private String street;
    @NotEmpty(message = "Please supply a value for city")
    private String city;
    @NotEmpty(message = "Please supply a value for state")
    private BigDecimal state;
    @NotEmpty(message = "Please supply a value for zipCode")
    private String zipCode;
    @NotEmpty(message = "Please supply a value for itemType")
    private int itemType;
    @NotEmpty(message = "Please supply a value for itemId")
    private int itemId;
    @NotEmpty(message = "Please supply a value for unitPrice")
    private int unitPrice;
    @NotEmpty(message = "Please supply a value for quantity")
    private int quantity;
    @NotEmpty(message = "Please supply a value for subtotal")
    private int subtotal;
    @NotEmpty(message = "Please supply a value for tax")
    private int tax;
    @NotEmpty(message = "Please supply a value for processingFee")
    private int processingFee;
    @NotEmpty(message = "Please supply a value for total")
    private int total;

    public InvoiceViewModel(int invoiceId, @NotEmpty(message = "Please supply a value for name") String name,
                            @NotEmpty(message = "Please supply a value for street") String street,
                            @NotEmpty(message = "Please supply a value for city") String city,
                            @NotEmpty(message = "Please supply a value for state") BigDecimal state,
                            @NotEmpty(message = "Please supply a value for zipCode") String zipCode,
                            @NotEmpty(message = "Please supply a value for itemType") int itemType,
                            @NotEmpty(message = "Please supply a value for itemId") int itemId,
                            @NotEmpty(message = "Please supply a value for unitPrice") int unitPrice,
                            @NotEmpty(message = "Please supply a value for quantity") int quantity,
                            @NotEmpty(message = "Please supply a value for subtotal") int subtotal,
                            @NotEmpty(message = "Please supply a value for tax") int tax,
                            @NotEmpty(message = "Please supply a value for processingFee") int processingFee,
                            @NotEmpty(message = "Please supply a value for total") int total) {
        this.invoiceId = invoiceId;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.itemType = itemType;
        this.itemId = itemId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.tax = tax;
        this.processingFee = processingFee;
        this.total = total;
    }

    public InvoiceViewModel() {
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceViewModel that = (InvoiceViewModel) o;
        return invoiceId == that.invoiceId &&
                itemType == that.itemType &&
                itemId == that.itemId &&
                unitPrice == that.unitPrice &&
                quantity == that.quantity &&
                subtotal == that.subtotal &&
                tax == that.tax &&
                processingFee == that.processingFee &&
                total == that.total &&
                name.equals(that.name) &&
                street.equals(that.street) &&
                city.equals(that.city) &&
                state.equals(that.state) &&
                zipCode.equals(that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceId, name, street, city, state, zipCode, itemType, itemId, unitPrice, quantity, subtotal, tax, processingFee, total);
    }
}
