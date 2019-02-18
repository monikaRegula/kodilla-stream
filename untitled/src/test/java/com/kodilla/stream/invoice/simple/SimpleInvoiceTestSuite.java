package com.kodilla.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {

    @Test
    public void testGetValueToPay(){
        //GIVEN
        SimpleInvoice invoice = new SimpleInvoice();

        //WHEN
        invoice.addItem(new SimpleItem(new SimpleProduct("product1",17.28),2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));

        //THEN
        Assert.assertEquals(108.975,invoice.getValueToPay(),0.001);
    }
}
