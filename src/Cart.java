import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static final float BASE_DISCOUNT = 0.05f; // base discount is 0.05
    private static final int DISCOUNT_THRESHOLD = 4; // number of books threshold that lead to the specified discount
    private int lowMultiplier, highMultiplier; // low and high multipliers to modify abse discount;
    private float orderPrice, lotPrice, lotDiscount; // order price, lot price and specified discount for the lot
    private List<Book> cart, lot, order; // lists of books in cart, books in discount lot and books in final order
    
    public Cart() {
        cart = new ArrayList<>();
        order = new ArrayList<>();
    }

    public void addToCart(Book book) {
        cart.add(book);
    }

    public void applyDiscounts() {
        while (cart.size() > 0) {
            applyDiscount(makeLot());
        }
    }

    /** adds book to discounted lot */
    private List<Book> makeLot() {
        lot = new ArrayList<>();

        for (Book book : Book.values()) {
            if (cart.contains(book)) {
                cart.remove(book);
                lot.add(book);
            }
        }
        order.addAll(lot);
        return lot;
    }

    private void applyDiscount(List<Book> lot) {
        lotPrice = 0f;
        applyBestDiscount();
        for (Book book : lot) {
            lotPrice += book.getPrice();
        }

        lotPrice -= (lotPrice * lotDiscount);
        orderPrice += lotPrice;
    }

    private void applyBestDiscount() {
        lowMultiplier = lot.size() - 1;
        highMultiplier = lot.size() + (lot.size() - DISCOUNT_THRESHOLD);

        if (lot.size() < DISCOUNT_THRESHOLD) {
            lotDiscount = BASE_DISCOUNT * lowMultiplier;

        } else if (lot.size() == DISCOUNT_THRESHOLD) {
            lotDiscount = BASE_DISCOUNT * lot.size();

        } else {
            lotDiscount = BASE_DISCOUNT * highMultiplier;
        }
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    @Override
    public String toString() {
        return "TOTAL PRICE AFTER DISCOUNTS: " + orderPrice;
    }
}
