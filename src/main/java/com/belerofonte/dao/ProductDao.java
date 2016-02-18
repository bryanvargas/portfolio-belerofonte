package com.belerofonte.dao;

import com.belerofonte.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shingo on 16/02/2016.
 */
@Component
public class ProductDao implements IProductoDao {
        private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();

        product1.setProducName("Guitarra");
        product1.setProductCategory("instrumento");
        product1.setProductDescription("Fender stratocaster 62");
        product1.setProductPrice(1200);
        product1.setProductCondition("nuevo");
        product1.setProductStatus("activo");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Fender Inc");

        Product product2 = new Product();

        product2.setProducName("Piano");
        product2.setProductCategory("instrumento");
        product2.setProductDescription("Yamaha 56");
        product2.setProductPrice(3500);
        product2.setProductCondition("nuevo");
        product2.setProductStatus("activo");
        product2.setUnitInStock(11);
        product2.setProductManufacturer("Yamaha Inc");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);

        return productList;
    }
}
