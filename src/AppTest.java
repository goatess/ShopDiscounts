import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void one_copy_price_is_8_euros() {
        final int COST = 8;
        Cart cart = new Cart();
        int bookPrice = Book.BOOK1.getPrice();
        assertEquals(COST, bookPrice);
    }

    @Test
    public void one_copy_costs_8_euros() {
        final float COST = 8f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 1);
    }

    @Test
    public void get_a_5_discount_when_2_different_books_in_cart() {
        final float COST = 15.2f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void dont_get_discount_if_all_2_books_in_cart_books_are_the_same() {
        final float COST = 16f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_10_discount_when_3_different_books_in_cart() {
        final float COST = 21.6f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void dont_get_discount_if_all_3_books_in_cart_books_are_the_same() {
        final float COST = 24f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_20_discount_when_4_different_books_in_cart() {
        final float COST = 25.6f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK4);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void dont_get_discount_if_all_4_books_in_cart_books_are_the_same() {
        final float COST = 32f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_25_discount_when_5_different_books_in_cart() {
        final float COST = 28f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK4);
        cart.addToBooks(Book.BOOK5);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void dont_get_discount_if_all_5_books_in_cart_books_are_the_same() {
        final float COST = 40f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_correct_discount_when_theres_2_copies_of_3_books_and_1_copy_of_the_other_2_books() {
        final float COST = 49.6f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK4);
        cart.addToBooks(Book.BOOK5);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }
    @Test
    public void get_a_25_discount_when_6_different_books_in_cart() {
        final float COST = 28.8f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK4);
        cart.addToBooks(Book.BOOK5);
        cart.addToBooks(Book.BOOK6);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void dont_get_discount_if_all_6_books_in_cart_books_are_the_same() {
        final float COST = 48f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }
    @Test
    public void get_a_25_discount_when_7_different_books_in_cart() {
        final float COST = 28f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK4);
        cart.addToBooks(Book.BOOK5);
        cart.addToBooks(Book.BOOK6);
        cart.addToBooks(Book.BOOK7);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void dont_get_discount_if_all_7_books_in_cart_books_are_the_same() {
        final float COST = 56f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void getRecipe(){
        final String RECIPE = "TOTAL PRICE AFTER DISCOUNTS: 49.6";
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK4);
        cart.addToBooks(Book.BOOK5);
        cart.applyDiscounts();
        assertEquals(RECIPE, cart.toString());
    }

    @Test
    public void get_a_correct_discount() {
        final float COST = 56f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK2);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK3);
        cart.addToBooks(Book.BOOK4);
        cart.addToBooks(Book.BOOK5);
        cart.addToBooks(Book.BOOK6);
        cart.addToBooks(Book.BOOK6);
        cart.addToBooks(Book.BOOK7);
        cart.addToBooks(Book.BOOK7);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_5_discount_when_2_copies_of_books_6_and_7_are_in_cart() {
        final float COST = 15.2f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK2);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void dont_get_discount_when_2_copies_of_books_7_are_in_cart() {
        final float COST = 16f;
        Cart cart = new Cart();
        cart.addToBooks(Book.BOOK1);
        cart.addToBooks(Book.BOOK1);
        cart.applyDiscounts();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }
}
