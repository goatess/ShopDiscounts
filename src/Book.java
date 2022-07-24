public enum Book {
    
    BOOK1(8),
    BOOK2(8),
    BOOK3(8),
    BOOK4(8),
    BOOK5(8);

    private Book(int price){
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }    
}
