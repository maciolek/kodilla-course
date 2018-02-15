package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Dao.Dao.InvoiceDao;
import com.kodilla.hibernate.invoice.Dao.Dao.ItemDao;
import com.kodilla.hibernate.invoice.Dao.Dao.ProductDao;
import com.kodilla.hibernate.invoice.Dao.Invoice;
import com.kodilla.hibernate.invoice.Dao.Item;
import com.kodilla.hibernate.invoice.Dao.Product;
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
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    private final String MILK = "Milk";
    private final String CHEESE = "Cheese";
    private final String BREAD = "Bread";

    @Test
    public void testInvoiceDaoSave() {
        //given

        Invoice invoice = new Invoice("2018/02/05");
        Product product1 = new Product(MILK);
        Product product2 = new Product(CHEESE);
        Product product3 = new Product(BREAD);

        Item item1 = new Item(new BigDecimal(2.5), 25);
        Item item2 = new Item(new BigDecimal(13.5), 40);
        Item item3 = new Item(new BigDecimal(3.5), 25);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //when
        invoiceDao.save(invoice);

        int product1Id = product1.getId();
        String actualNameOFProduct1 = product1.getName();
        int numberOfItems = invoice.getItems().size();
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findOne(id);
        int numberOfItemOnInvoce = readInvoice.getItems().size();

        //then
        Assert.assertEquals(MILK, actualNameOFProduct1);
        Assert.assertNotEquals(0, product1Id);
        Assert.assertEquals(3, numberOfItems);
        Assert.assertEquals(id, readInvoice.getId());
        Assert.assertEquals(3, numberOfItemOnInvoce);
    }
}
