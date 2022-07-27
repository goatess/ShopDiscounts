import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private static final float BASE_DISCOUNT = 0.05f;
    private static final int MULTIPLIER_THRESHOLD = 4;
    private int lowMultiplier, highMultiplier; 
    private float orderPrice, lotPrice, lotDiscount;
    private List<Book> order, lot;

    public PriceCalculator(List<Book>order) {
        this.order = order;
        while (this.order.size() > 0) {
            applyDiscount(makeLot());
        }
    }
    
    private List<Book> makeLot() {
        lot = new ArrayList<>();
        for (Book book : Book.values()) {
            if (order.contains(book)) {
                order.remove(book);
                lot.add(book);
            }
        }
        return lot;
    }

    private void applyDiscount(List<Book> lot) {
        lotPrice = 0f;
        selectBestDiscount();
        for (Book book : lot) {
            lotPrice += book.getPrice();
        }

        lotPrice -= (lotPrice * lotDiscount);
        orderPrice += lotPrice;
    }

    private void selectBestDiscount() {
        lowMultiplier = lot.size() - 1;
        highMultiplier = lot.size() + (lot.size() - MULTIPLIER_THRESHOLD);
        // get a low discount
        if (lot.size() < MULTIPLIER_THRESHOLD) {
            lotDiscount = BASE_DISCOUNT * lowMultiplier;
        // get a standard discount
        } else if (lot.size() == MULTIPLIER_THRESHOLD) {
            lotDiscount = BASE_DISCOUNT * lot.size();
        // get a high discount
        } else {
            lotDiscount = BASE_DISCOUNT * highMultiplier;
        }
    }

    public float getOrderPrice() {
        return orderPrice;
    }
}