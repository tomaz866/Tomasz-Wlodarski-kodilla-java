package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("TV");
        Product product1 = new Product("KUBEK");
        productDao.save(product);
        productDao.save(product1);
        Item item = new Item(new BigDecimal(20),4,new BigDecimal(80));
        Item item1 = new Item(new BigDecimal(40),3,new BigDecimal(120));
        Item item2 = new Item(new BigDecimal(10),10,new BigDecimal(100));
        item.setProduct(product);
        item1.setProduct(product);
        item2.setProduct(product1);
        Invoice invoice = new Invoice("334567");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int id1 = product.getId();
        int id2 = product1.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.delete(id);
        productDao.delete(id1);
        productDao.delete(id2);
    }
}
