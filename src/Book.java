public enum Book {

    BOOK1(8),
    BOOK2(8),
    BOOK3(8),
    BOOK4(8),
    BOOK5(8),
    BOOK6(8),
    BOOK7(8);

    private Book(int price) {
        this.PRICE = price;
    }

    private final int PRICE;

    public int getPrice() {
        return PRICE;
    }
}
