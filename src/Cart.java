import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static final float BASE_DISCOUNT = 0.05f;
    private static final int DISCOUNT_THRESHOLD = 4;
    private float orderPrice, discount;
    private List<Book> cart, lot, order;

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

        lotPrice = lotPrice - (lotPrice * discount);
        orderPrice += lotPrice;
    }

    private void applyBestDiscount() {
        int lotSize = lot.size();
        int lowDiscount = lotSize - 1;
        int highDiscount = lotSize + (lotSize - DISCOUNT_THRESHOLD);

        if (lotSize < DISCOUNT_THRESHOLD) {
            discount = BASE_DISCOUNT * lowDiscount;

        } else if (lotSize == DISCOUNT_THRESHOLD) {
            discount = BASE_DISCOUNT * lotSize; // = 0.2f discount

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
