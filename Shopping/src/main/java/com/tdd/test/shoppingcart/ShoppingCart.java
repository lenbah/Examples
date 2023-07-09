package com.tdd.test.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList = new ArrayList<>();

    public int getProductCount() {
        return productList.size();
    }
    public void addProduct(Product product) {
        productList.add(product);
    }



}