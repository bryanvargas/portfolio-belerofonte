package com.belerofonte.controller;

import com.belerofonte.dao.IProductoDao;
import com.belerofonte.dao.ProductDao;
import com.belerofonte.model.Product;

import com.belerofonte.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Shingo on 16/02/2016.
 */
@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

  /*  @RequestMapping("/productList")
    public String getProduct(Model model){
        List<Product> productList = productoDao.getProductList();
        Product product = productList.get(0);
        model.addAttribute(product);
        return "productList";
    }*/

    @RequestMapping("/productList")
    public String getProduct(Model model){
        List<Product> products = productService.getProductList();
        model.addAttribute("products",products);
        return "productList";
    }
}

