import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    Cart cart = new Cart();
    
    @Test
    public void one_copy_price_is_8_euros(){
        final int COST = 8;
        int bookPrice = Book.BOOK1.getPrice();
        assertEquals(COST, bookPrice);
    }

    @Test
    public void one_copy_costs_8_euros(){
        final int COST = 8;
        cart.addToCart(Book.BOOK1);
        cart.checkout();
        int totalCost = cart.getBooksPrice();
        assertEquals(COST, totalCost);
    }
    
}
