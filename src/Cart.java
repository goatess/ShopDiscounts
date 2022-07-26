import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static final float BASE_DISCOUNT = 0.05f; // base discount is 0.05
    private static final int DISCOUNT_THRESHOLD = 4; // number of books threshold that lead to the specified discount
    private float orderPrice, discount; // order price and specified discount for the lot
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
        float lotPrice = 0;

        applyBestDiscount();
        for (Book book : lot) {
            lotPrice += book.getPrice();
        }

        lotPrice -= (lotPrice * discount);
        orderPrice += lotPrice;
    }

    private void applyBestDiscount() {
        int lowDiscount = lot.size() - 1;
        int highDiscount = lot.size() + (lot.size() - DISCOUNT_THRESHOLD);

        if (lot.size() < DISCOUNT_THRESHOLD) {
            discount = BASE_DISCOUNT * lowDiscount;

        } else if (lot.size() == DISCOUNT_THRESHOLD) {
            discount = BASE_DISCOUNT * lot.size();

        } else {
            discount = BASE_DISCOUNT * highDiscount;
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
