package com.westminster.class_practice.demo;

import com.westminster.class_practice.demo.productapi.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTests {

    @Test
    public void testProduct() {
        Product product = new Product(11, "Laptop", 20, true, 12.33);
        assertEquals(11, product.getId());
        assertEquals("Laptop", product.getName());
    }
}
