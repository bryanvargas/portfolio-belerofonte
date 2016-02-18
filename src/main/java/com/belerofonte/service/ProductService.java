package com.belerofonte.service;

import com.belerofonte.dao.IProductoDao;
import com.belerofonte.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * Created by Shingo on 17/02/2016.
 */
@Service
public class ProductService {
    @Autowired
    private IProductoDao productDao;

    public List<Product>  getProductList(){
        return productDao.getProductList();
    }
}
