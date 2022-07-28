import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private static final float BASE_DISCOUNT = 0.05f;
    private static final int MULTIPLIER_THRESHOLD = 4;
    private float orderPrice, lotPrice, lotDiscount;
    private List<Book> order, lot;

    public PriceCalculator(List<Book> order) {
        this.order = order;
        while (this.order.size() > 0) {
            applyPromo();
        }
    }

    private void applyPromo() {
        makePromoLot();
        selectBestDiscount();
        applyDiscount();
        addToOrderPrice();
    }

    private void makePromoLot() {
        lot = new ArrayList<>();
        for (Book book : Book.values()) {
            if (order.contains(book)) {
                order.remove(book);
                lot.add(book);
            }
        }
    }

    private void selectBestDiscount() {
        int lowMultiplier, highMultiplier, lotSize;
        lotSize = lot.size();
        lowMultiplier = lotSize - 1;
        highMultiplier = lotSize + (lotSize - MULTIPLIER_THRESHOLD);

        if (lotSize < MULTIPLIER_THRESHOLD) {
            lotDiscount = BASE_DISCOUNT * lowMultiplier;

        } else if (lotSize == MULTIPLIER_THRESHOLD) {
            lotDiscount = BASE_DISCOUNT * lotSize;

        } else {
            lotDiscount = BASE_DISCOUNT * highMultiplier;
        }
    }

    private void applyDiscount() {
        lotPrice = 0f;
        for (Book book : lot) {
            lotPrice += book.getPrice();
        }
        lotPrice -= (lotPrice * lotDiscount);
    }

    private void addToOrderPrice() {
        orderPrice += lotPrice;
    }

    public float getOrderPrice() {
        return orderPrice;
    }
}
