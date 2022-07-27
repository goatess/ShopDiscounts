import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void price_of_one_copy_of_any_book_is_8_euros() {
        final int COST = 8;
        int bookPrice = Book.BOOK1.getPrice();
        assertEquals(COST, bookPrice);
    }

    @Test
    public void cart_price_of_1_copy_is_8_euros() {
        final float COST = 8f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 1);
    }
    @Test
    public void order_price_of_2_copies_of_book_1_is_16() {
        final float COST = 16f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK1);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void order_price_of_2_copies_of_book_2_is_16() {
        final float COST = 16f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK2);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_5_percent_discount_when_2_different_books_in_cart() {
        final float COST = 15.2f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void order_price_of_3_books_is_24() {
        final float COST = 24f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK3);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_10_percent_discount_when_3_different_books_in_cart() {
        final float COST = 21.6f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void order_price_of_4_of_the_same_book_is_32() {
        final float COST = 32f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK4);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_20_percent_discount_when_4_different_books_in_cart() {
        final float COST = 25.6f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK4);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }
    @Test
    public void order_price_of_5_of_the_same_book_is_40() {
        final float COST = 40f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK5);
        cart.addToOrder(Book.BOOK5);
        cart.addToOrder(Book.BOOK5);
        cart.addToOrder(Book.BOOK5);
        cart.addToOrder(Book.BOOK5);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_30_percent_discount_when_5_different_books_in_cart() {
        final float COST = 28f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK5);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void order_price_of_6_of_the_same_book_is_48() {
        final float COST = 48f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK6);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }
    @Test
    public void get_a_40_percent_discount_when_6_different_books_in_cart() {
        final float COST = 28.8f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK5);
        cart.addToOrder(Book.BOOK6);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void order_price_for_7_of_the_same_book_is_56() {
        final float COST = 56f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK7);
        cart.addToOrder(Book.BOOK7);
        cart.addToOrder(Book.BOOK7);
        cart.addToOrder(Book.BOOK7);
        cart.addToOrder(Book.BOOK7);
        cart.addToOrder(Book.BOOK7);
        cart.addToOrder(Book.BOOK7);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_a_50_percent_discount_when_7_different_books_in_cart() {
        final float COST = 28f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK5);
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK7);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_correct_order_price_when_theres_2_copies_of_3_books_and_1_copy_of_the_other_2_books() {
        final float COST = 49.6f;  // (5 * 8 * 0,7) + (3 * 8 * 0,9) = 28 + 21,6 = 49,6
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK5);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }


    @Test
    public void get_a_correct_discount() {
        final float COST = 56f;
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK5);
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK6);
        cart.addToOrder(Book.BOOK7);
        cart.addToOrder(Book.BOOK7);
        cart.calculatePrice();
        float totalCost = cart.getOrderPrice();
        assertEquals(COST, totalCost, 0);
        assertTrue(COST == totalCost);
    }

    @Test
    public void get_recipe_of_ordered_books() {
        final String RECIPE = "TOTAL PRICE AFTER DISCOUNTS: 49.6";
        Cart cart = new Cart();
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK1);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK2);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK3);
        cart.addToOrder(Book.BOOK4);
        cart.addToOrder(Book.BOOK5);
        cart.calculatePrice();
        assertEquals(RECIPE, cart.toString());
    }
}
