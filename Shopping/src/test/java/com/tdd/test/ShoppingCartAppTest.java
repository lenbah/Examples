package com.tdd.test;
import com.tdd.test.shoppingcart.Product;
import com.tdd.test.shoppingcart.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartAppTest {
    @Test
    public void testCreateEmptyShoppingCart() {
        ShoppingCart cart = new ShoppingCart();
        Assert.assertEquals(0, cart.getProductCount());
    }



    @Test
    public void testAddSingleProductToShoppingCart() {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("Gatsby hair cream", 1, 30.0);
        cart.addProduct(product);
        Assert.assertEquals(1, cart.getProductCount());
    }
}