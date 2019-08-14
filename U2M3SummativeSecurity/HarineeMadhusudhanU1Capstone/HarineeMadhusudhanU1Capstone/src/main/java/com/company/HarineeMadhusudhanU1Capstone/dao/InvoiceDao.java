package com.company.HarineeMadhusudhanU1Capstone.dao;


import com.company.HarineeMadhusudhanU1Capstone.dto.Invoice;

import java.util.List;

public interface InvoiceDao {

       Invoice addInvoice(Invoice invoice);

       Invoice getInvoice(int invoiceId);

       List<Invoice> getAllInvoices();

       void deleteInvoice(int invoiceId);
}
