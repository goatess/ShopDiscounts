import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> order;
    private float orderPrice;
    private PriceCalculator priceCalculator;

    public Cart() {
        order = new ArrayList<>();
    }

    public void calculatePrice() {
        priceCalculator = new PriceCalculator(order);
        this.orderPrice = priceCalculator.getOrderPrice();        
    }

    public void addToOrder(Book book) {
        order.add(book);
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    @Override
    public String toString() {
        return "TOTAL PRICE AFTER DISCOUNTS: " + orderPrice;
    }
}
