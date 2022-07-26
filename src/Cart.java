import java.util.ArrayList;
import java.util.List;

public class Cart {

    private float price = 0;
    private List<Book> cart;
    private List<Book> bundle;
    private static final float BASE_PERCENT = 0.05f;

    public Cart() {
        cart = new ArrayList<>();
    }

    public void addToCart(Book book) {
        cart.add(book);
    }

    public void checkout() {
        makeBundle();
        calculateBundlePrice(calculateDiscount());
        while (cart.size() > 0) {
            checkout();
        }
    }

    /** adds book to discounted bundle  */
    private void makeBundle() {
        bundle = new ArrayList<>();
        for (Book book : Book.values()) {

            if (cart.contains(book)) {
                cart.remove(book);
                bundle.add(book);
            }
        }
    }

    /** calculates bundle discount percentage  */
    private void calculateBundlePrice(float percentage) {
        float bundlePrice = bundle.size() * 8;
        bundlePrice = bundlePrice - (bundlePrice * percentage);
        price += bundlePrice;
    }

    private float calculateDiscount() {
        float discount;
        int bundledBooks = bundle.size();

        if (bundledBooks < 4) {
            discount = BASE_PERCENT * (bundledBooks - 1);

        } else if (bundledBooks == 4) {
            discount = BASE_PERCENT * bundledBooks; // = 0.2f discount

        } else {
            discount = BASE_PERCENT * (bundledBooks + (bundledBooks - 4));
        }
        return discount;
    }

    public float getCartPrice() {
        return price;
    }

    @Override
    public String toString() {
        String recipe = "";
        for (Book book : cart) {
            recipe += book.toString() + "\n";    
        }
        recipe += "TOTAL PRICE AFTER DISCOUNTS: " + price;
        return recipe;
    }
}
