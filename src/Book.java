public enum Book {

    BOOK1(8, "book1"),
    BOOK2(8, "book2"),
    BOOK3(8, "book3"),
    BOOK4(8, "book4"),
    BOOK5(8, "book5"),
    BOOK6(8, "book6"),
    BOOK7(8, "book7");

    private Book(int price, String title) {
        this.PRICE = price;
        this.TITLE = title;
    }

    private final int PRICE;
    private final String TITLE;

    public int getPrice() {
        return PRICE;
    }
    @Override
    public String toString() {
        String price = String.valueOf(PRICE);
        return "#1 " + TITLE + " " + price;
    }
}
