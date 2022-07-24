import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int booksNumber, booksPrice;
    List<Book> booksInCart = new ArrayList();

    public Cart() {

    }

    public void addToCart(Book book) {
        booksInCart.add(book);
    }

    public void checkout() {
        booksPrice = 0;
        booksInCart.forEach(book -> booksPrice += book.getPrice());
        booksInCart.clear();
    }

    public int getBooksPrice() {
        return booksPrice;
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public List<Book> getBooksInCart() {
        return booksInCart;
    }
}
